package br.com.app.service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import br.com.app.model.ColetaResultado;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class EnviaColetaManger {

  private RestTemplate restTemplate = new RestTemplate();
  private ScheduledExecutorService execService;
  @Value("${serverHost}")
  private String serverHost;
  @Value("${tempoEspera}")
  private Integer tempoEspera;
  @Autowired
  private ColetaService coletaService;

  @Transactional(readOnly = false)
  public void schedule() {

    execService = Executors.newScheduledThreadPool(5);
    execService.scheduleAtFixedRate(() -> {

      ColetaResultado resultado = coletaService.findFirstByOrderByScanDateTimeDesc();

      restTemplate.postForEntity(serverHost.concat("/rest/json"),
          new HttpEntityFactory(resultado.getJson()).factory(), String.class);
      resultado.setEnviadoStatus(true);
      coletaService.save(resultado);

    }, 0, tempoEspera, TimeUnit.SECONDS);

  }
}
