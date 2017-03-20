package br.com.app.domain;

import java.time.LocalDate;

import oshi.hardware.Firmware;

public class FirmwareEntity {

	private String manufacturer;

	private String name;

	private String description;

	private String version;
	private LocalDate releaseDate;
	//private Date releaseDate;
	public FirmwareEntity() {}
	public FirmwareEntity(Firmware firmware)
	{
		this.manufacturer = firmware.getManufacturer();
		this.name = firmware.getName();
		this.description = firmware.getDescription();
		this.version = firmware.getVersion();
		this.releaseDate = firmware.getReleaseDate();
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
