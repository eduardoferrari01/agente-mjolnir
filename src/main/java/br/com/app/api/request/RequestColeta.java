package br.com.app.api.request;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.api.impl.ServeApi;
import br.com.app.api.impl.ServeApiImpl;
import br.com.app.coleta.factory.Coleta;
import br.com.app.util.PropertiesLoad;

public class RequestColeta {

	private final String host;
	private final ServeApi serveApi;
	private String  pathFile = "src/main/resources/application.properties"; 
	
	public RequestColeta(RequestMappingEnum requestMapping) {

		this.host = createUrl(requestMapping);
		this.serveApi = new ServeApiImpl();
	}
	
	private String createUrl(RequestMappingEnum requestMapping) {
		
		PropertiesLoad propertiesLoad = new PropertiesLoad(pathFile);
		RequestProperties requestProperties = new RequestProperties(propertiesLoad.getProperties());
		return requestProperties.getUrl()+requestMapping.getHost();
	}
	
	public void enviar(Coleta coleta) {
		
		this.serveApi.enviar(this.host,coleta.coletar());
	}
}
