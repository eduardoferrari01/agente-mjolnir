package br.com.app.domain.service;

import org.springframework.web.client.RestTemplate;

import br.com.app.domain.SystemInfoEntity;

public class RestTemplateSystemInfo {

	private RestTemplate restTemplate = new RestTemplate();
	private String uriSalvar = "http://1.2.4.126:8081/rest/json";

	public SystemInfoEntity enviar(SystemInfoEntity systemInfoEntity)
	{
		return restTemplate.postForObject(uriSalvar,systemInfoEntity,SystemInfoEntity.class);
	}
}
