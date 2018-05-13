package br.com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.service.ColetaService;;

@RestController
@RequestMapping("/rest")
public class Controller {

	@Autowired
	private ColetaService coleta;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/coletar")
	public void coletar() {
		coleta.coletar();
	}
}
