package br.com.app.api.request;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.api.impl.ServeApi;
import br.com.app.api.impl.ServeApiImpl;
import br.com.app.coleta.factory.Coleta;

public class RequestColeta extends Request {

	private final String host;
	private final ServeApi serveApi;
	 
	public RequestColeta(RequestMappingEnum requestMapping) {

		this.host = createUrl(requestMapping);
		this.serveApi = new ServeApiImpl(host);
	}
	
	public void post(Coleta coleta) {
		
		this.serveApi.post(coleta.coletaResultadoBuilder().toJson());
	}
}
