package br.com.app.api.request;

import java.util.Properties;

public class RequestProperties {

	private Properties properties;

	public RequestProperties(Properties properties) {

		this.properties = properties;
	}

	public String getUrl() {

		return properties.getProperty("server.url");
	}
}
