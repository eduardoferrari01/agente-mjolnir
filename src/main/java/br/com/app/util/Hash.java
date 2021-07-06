package br.com.app.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hash {

	private final String path = "src/main/resources/hash.txt";

	public void save(String hash)  {

		try {
			if(hash != null && !hash.isBlank()) {
				
				Files.writeString(Paths.get(path), hash.trim());
			}else {

				throw new IllegalArgumentException("The hash parameter cannot be null or empty");
			}
			
		} catch (IOException e) {
			 
			e.printStackTrace();
		}

	}

	public String findHash() {

		String hash = "";
		try {
			
			hash = Files.readString(Paths.get(path)).trim();
			
			if(hash.isBlank()) {
				
				throw new NotFoundException("Hash is not found");
			}
		
		} catch (IOException e) {

			e.printStackTrace();
		}
		return hash;
	}
}
