package br.com.app.service;

import org.springframework.beans.factory.annotation.Value;
import br.com.app.model.Agente;
import br.com.app.util.Hash;
import oshi.json.hardware.NetworkIF;
import oshi.json.software.os.NetworkParams;;

public class AgenteCria {

  @Value("${tempoEspera}")
  private Integer tempoEspera;

  public Agente criar() {

    NetworkUtil util = new NetworkUtil();

    NetworkIF[] networkIF = Coleta.getInstance().coletarNetworkIF();
    NetworkParams netWorkParams = Coleta.getInstance().getNetworkParams();

    Agente agente = new Agente();
    agente.setId(Hash.getInstance().getHash());
    agente.setTempoEspera(tempoEspera);
    agente.setHostName(netWorkParams.getHostName());
    agente.setIp(util.getIps(networkIF));
    return agente;
  }


}
