package br.com.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.app.api.request.RequestProperties;
import br.com.app.util.PropertiesLoad;

public class PropertiesTest {

	private String  pathFile = "src/main/resources/application.properties";
	
	@Test
	public void deveRetornarPropertyURL() {
		
		PropertiesLoad propertiesLoad = new PropertiesLoad(pathFile);
		
		RequestProperties requestProperties = new RequestProperties(propertiesLoad.getProperties());
		
		assertEquals("http://localhost:8081/api/", requestProperties.getUrl());
		
	}
	
	 
}
