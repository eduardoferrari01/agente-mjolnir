package br.com.app.model;

import java.io.Serializable;
import java.util.List;

import br.com.app.util.Json;

public class Config implements Serializable {

	private String hash;
	private String hostName;
	private Integer tempoEspera = 3;

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
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

	public String toJson() {

		Json utilJson = new Json();

		return utilJson.objectToString(this);
	}
}
