package br.com.app.service;

import org.springframework.web.client.RestTemplate;

public class RestTemplateSystemInfo {

	private RestTemplate restTemplate = new RestTemplate();
	private String uriSalvar = "";

	/*public SystemInfoEntity enviar(SystemInfoEntity systemInfoEntity)
	{
		return restTemplate.postForObject(uriSalvar,systemInfoEntity,SystemInfoEntity.class);
	}*/
}
