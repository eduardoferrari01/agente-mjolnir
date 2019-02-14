package br.com.app.service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.app.model.ColetaResultado;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ColetaManager {

  @Autowired
  private ColetaService coletaService;
  private ScheduledExecutorService execService;
  @Value("${tempoEspera}")
  private Integer tempoEspera;

  public void schedule() {

    execService = Executors.newScheduledThreadPool(5);
    execService.scheduleAtFixedRate(() -> {
      ColetaResultado resultado = Coleta.getInstance().coletar();
      resultado.setEnviadoStatus(false);
      coletaService.save(resultado);

    }, 0, tempoEspera, TimeUnit.SECONDS);

  }

  public String forcaColeta() {
    ColetaResultado resultado = Coleta.getInstance().coletar();
    coletaService.save(resultado);
    return resultado.getJson();
  }

  public void scheduleStop() {
    execService.shutdownNow();
  }



}
