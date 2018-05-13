package br.com.app;


import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.app.util.Hash;


@Component
public class Inicializa {

	
	@EventListener(ContextRefreshedEvent.class)
	void contextRefreshedEvent(){
		
		Hash.getInstance().gerar();
	}

}
