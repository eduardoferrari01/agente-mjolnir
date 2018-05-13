package br.com.app.service;

import oshi.json.SystemInfo;

public class Coleta {

	private static Coleta instance;

	private Coleta() {

	}

	public static Coleta getInstance() {

		if (instance == null) {
			instance = new Coleta();
		}
		return instance;
	}

	public String coletar() {
		SystemInfo si = new SystemInfo();
		System.out.println("Coletando..");
		return si.toPrettyJSON();

	}

}
