package br.com.app.api.request;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.api.impl.ServeApi;
import br.com.app.api.impl.ServeApiImpl;
import br.com.app.model.Config;
import br.com.app.util.Json;

public class ConfigRequest extends Request {

	private final String host;
	private final ServeApi serveApi;

	public ConfigRequest(RequestMappingEnum requestMapping) {

		this.host = createUrl(requestMapping);
		this.serveApi = new ServeApiImpl(this.host);
	}

	public Config createConfig(String hostName) {

		String json = this.serveApi.post(hostName);
		Json utilJson = new Json();
		return (Config) utilJson.stringToObject(json, Config.class);
	}
}
