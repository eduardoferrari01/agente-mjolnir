package br.com.app;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.api.request.ConfigRequest;
import br.com.app.coleta.factory.SystemInfoFactory;
import br.com.app.model.Config;
import br.com.app.util.Hash;

@Component
public class Inicializa {

	@EventListener(ContextRefreshedEvent.class)
	void contextRefreshedEvent() {

		String hostName = SystemInfoFactory.createOperatingSystem().getNetworkParams().getDomainName();
		
		ConfigRequest configRequest = new ConfigRequest(RequestMappingEnum.CONFIG_CREATE);
		
		Config config = configRequest.createConfig(hostName);
		
		new Hash().save(config.getHash());
	
	}
}
