package br.com.app;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.app.coleta.factory.SystemInfoFactory;
import br.com.app.util.GenerateHash;
import br.com.app.util.Hash;

@Component
public class Inicializa {

	@EventListener(ContextRefreshedEvent.class)
	void contextRefreshedEvent() {

		String hostName = SystemInfoFactory.createOperatingSystem().getNetworkParams().getDomainName();
		
		GenerateHash generateHash = new GenerateHash("SHA-256");
		
		String hash = generateHash.gerar(hostName);
		
		new Hash().save(hash);
	
	}

}
