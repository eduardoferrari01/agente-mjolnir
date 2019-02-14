package br.com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import br.com.app.service.AgenteCria;
import br.com.app.service.ColetaManager;
import br.com.app.service.EnviaColetaManger;
import br.com.app.util.Hash;


@Component
public class Inicializa {

  @Autowired
  private ColetaManager coletaManager;
  @Autowired
  private EnviaColetaManger enviaColetaManger;

  @EventListener(ContextRefreshedEvent.class)
  void contextRefreshedEvent() {

    Hash.getInstance().gerar();

    new AgenteCria().criar();
    coletaManager.schedule();
    enviaColetaManger.schedule();

  }

}
