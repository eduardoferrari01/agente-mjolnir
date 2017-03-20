package br.com.app.domain;

import oshi.hardware.PowerSource;

public class PowerSourceEntity {

	private String name;

    private Double remainingCapacity;

    private Double timeRemaining;

    
    public PowerSourceEntity(){}
    public PowerSourceEntity(PowerSource powerSource)
    {
    	this.name = powerSource.getName();
    	this.remainingCapacity = powerSource.getRemainingCapacity();
    	this.timeRemaining = powerSource.getTimeRemaining();
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRemainingCapacity() {
		return remainingCapacity;
	}

	public void setRemainingCapacity(Double remainingCapacity) {
		this.remainingCapacity = remainingCapacity;
	}

	public Double getTimeRemaining() {
		return timeRemaining;
	}

	public void setTimeRemaining(Double timeRemaining) {
		this.timeRemaining = timeRemaining;
	}
    
    
    
}
