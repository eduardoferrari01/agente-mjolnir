package br.com.app.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json  {

	public String objectToString(Object obj) {

		ObjectMapper mapper = new ObjectMapper( );
		try {
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			 
			e.printStackTrace();
		}
		return "";

	}
	
	public Object stringToObject(String json, Class<?> clas){
		
		ObjectMapper mapper = new ObjectMapper( );
		
		try {
			return mapper.readValue(json,clas);
			 
		} catch (IOException e) {
			 
			e.printStackTrace();
		} 
		return null;
	}
}