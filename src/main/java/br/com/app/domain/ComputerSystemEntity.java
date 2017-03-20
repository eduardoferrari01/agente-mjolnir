package br.com.app.domain;

import oshi.hardware.ComputerSystem;

public class ComputerSystemEntity {

	private String manufacturer;
	private String model;
	private String serialNumber;
	private FirmwareEntity firmware;
	private BaseboardEntity baseboard;
	
	public ComputerSystemEntity(){}
	public ComputerSystemEntity(ComputerSystem computerSystem)
	{
		this.manufacturer = computerSystem.getManufacturer();
		this.model = computerSystem.getModel();
		this.serialNumber = computerSystem.getSerialNumber();
		this.firmware = new FirmwareEntity(computerSystem.getFirmware());
		this.baseboard = new BaseboardEntity(computerSystem.getBaseboard());
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

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public FirmwareEntity getFirmware() {
		return firmware;
	}

	public void setFirmware(FirmwareEntity firmware) {
		this.firmware = firmware;
	}

	public BaseboardEntity getBaseboard() {
		return baseboard;
	}

	public void setBaseboard(BaseboardEntity baseboard) {
		this.baseboard = baseboard;
	}

	
	
}
