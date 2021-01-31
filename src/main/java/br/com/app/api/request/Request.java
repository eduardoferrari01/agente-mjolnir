package br.com.app.api.request;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.util.PropertiesLoad;

public abstract class Request {

	private String  pathFile = "src/main/resources/application.properties"; 
	
	protected String createUrl(RequestMappingEnum requestMapping) {
		
		PropertiesLoad propertiesLoad = new PropertiesLoad(pathFile);
		RequestProperties requestProperties = new RequestProperties(propertiesLoad.getProperties());
		return requestProperties.getUrl()+requestMapping.getHost();
	}
}
