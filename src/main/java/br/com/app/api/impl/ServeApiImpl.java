package br.com.app.api.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ServeApiImpl implements ServeApi {

	private RestTemplate restTemplate;
	private HttpHeaders headers;
	private String host;
	
	public ServeApiImpl(String host) {
		this.restTemplate = new RestTemplate();
		this.headers = new HttpHeaders();
		this.headers.setContentType(MediaType.APPLICATION_JSON);
		this.host = host;
	}

	@Override
	public String post(String json) {
 
		HttpEntity<String> request = new HttpEntity<String>(json, headers);
		ResponseEntity<String> result = this.restTemplate.postForEntity(host, request, String.class);
		return result.getBody();
	}

	@Override
	public String get() {
		
		ResponseEntity<String> result = this.restTemplate.getForEntity(host, String.class);
		return result.getBody();
		
	}

	@Override
	public String get(String variables) {
		ResponseEntity<String> result = this.restTemplate.getForEntity(host, String.class, variables);
		return result.getBody();
	}
}
