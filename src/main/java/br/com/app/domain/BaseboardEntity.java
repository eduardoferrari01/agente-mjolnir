package br.com.app.domain;

import oshi.hardware.Baseboard;

public class BaseboardEntity {

	 private String manufacturer;
	 private String model;
	 private String version;
	 private String serialNumber;
	 
	 public BaseboardEntity()
	 {
		 
	 }
	 public BaseboardEntity(Baseboard baseboard)
	 {
		 this.manufacturer = baseboard.getManufacturer();
		 this.model = baseboard.getModel();
		 this.version = baseboard.getVersion();
		 this.serialNumber = baseboard.getSerialNumber();
	 }
	 
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	 
}
