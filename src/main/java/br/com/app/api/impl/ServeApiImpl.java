package br.com.app.api.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import br.com.app.model.ColetaResultado;
 
public class ServeApiImpl implements ServeApi{

	@Override
	public void enviar(String host, ColetaResultado coletaResultado) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		RestTemplate restTemplate = new RestTemplate();
		 
		HttpEntity<String> request = 
			      new HttpEntity<String>(coletaResultado.toJson(), headers);
			   
		restTemplate.postForEntity(host,request , ColetaResultado.class);
		
	}
}
