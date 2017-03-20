package br.com.app.domain;

import oshi.hardware.Display;

public class DisplayEntity {

	private String display;
	
	public DisplayEntity() {}
	private DisplayEntity(Display display) {
		
		this.display = display.toString();
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
}
