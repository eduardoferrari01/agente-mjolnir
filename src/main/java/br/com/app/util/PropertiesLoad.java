package br.com.app.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoad {

	private  Properties properties;
	private final String pathFile ;
	
	public PropertiesLoad(String pathFile) {
		
		this.pathFile = pathFile;
		readPropertiesFile();
	}
	
	private void readPropertiesFile() {
		
		try (InputStream input = new FileInputStream(pathFile)) {

			properties = new Properties();
			properties.load(input);
 
	     } catch (IOException ex) {
	         ex.printStackTrace();
	     }
	}
	
	public Properties getProperties() {
		
		return this.properties;
	}
	
	
}
