package br.com.app.model;

import java.io.Serializable;
import java.util.List;

public class Agente implements Serializable {

  private static final long serialVersionUID = -7771131969650057398L;

  private String id;
  private List<String> ip;
  private String hostName;
  private Integer tempoEspera = 3;

  public List<String> getIp() {
    return ip;
  }

  public void setIp(List<String> ip) {
    this.ip = ip;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public Integer getTempoEspera() {
    return tempoEspera;
  }

  public void setTempoEspera(Integer tempoEspera) {
    this.tempoEspera = tempoEspera;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



}
