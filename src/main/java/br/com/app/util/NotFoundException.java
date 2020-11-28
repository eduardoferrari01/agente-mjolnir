package br.com.app.util;

public class NotFoundException extends  RuntimeException{

	private static final long serialVersionUID = -4056325949933507856L;
	
    public NotFoundException(String message) {
    	super(message);
    }
 

}
