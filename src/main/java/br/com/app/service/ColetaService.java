package br.com.app.service;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.node.ObjectNode;

import br.com.app.util.Hash;

 

@Service
public class ColetaService {

	public void coletar() {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.submit(() -> {
			String json = addHash(Coleta.getInstance().coletar());
			
		});

	}

	public String addHash(String json) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectReader reader = mapper.reader();
		JsonNode node = null;
		try {
			node = reader.readTree(json);
			((ObjectNode) node).put("id", Hash.getInstance().getHash() );

		} catch (IOException e) {

			e.printStackTrace();
		}
		return node.toString();
	}
	
}
