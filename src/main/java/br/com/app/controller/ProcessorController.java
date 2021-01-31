package br.com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.api.request.RequestColeta;
import br.com.app.coleta.factory.Coleta;
import br.com.app.coleta.hardware.ProcessorCollect;

@RestController
@RequestMapping("/api/processor")
public class ProcessorController {

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/coletar")
	public void coletar() {
		
		RequestColeta requestColeta = new RequestColeta(RequestMappingEnum.PROCESSOR);
		
		Coleta processorColeta = new ProcessorCollect();
		
		requestColeta.post(processorColeta);
		 
	}
	
}
