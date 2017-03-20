package br.com.app.domain;

import java.util.ArrayList;
import java.util.List;

import oshi.hardware.Sensors;

public class SensorsEntity {

	private Double cpuTemperature;
	private List<Integer>fanSpeeds;
	private Double cpuVoltage;
	
	public SensorsEntity(){}
	public SensorsEntity(Sensors sensors)
	{
		this.cpuTemperature = sensors.getCpuTemperature();
		this.cpuVoltage = sensors.getCpuVoltage();
		this.fanSpeeds = new ArrayList<Integer>();
		
		for(Integer fanSpeend : sensors.getFanSpeeds())
		{
			this.fanSpeeds.add(fanSpeend);
		}
		
	}
	public Double getCpuTemperature() {
		return cpuTemperature;
	}
	public void setCpuTemperature(Double cpuTemperature) {
		this.cpuTemperature = cpuTemperature;
	}
	public List<Integer> getFanSpeeds() {
		return fanSpeeds;
	}
	public void setFanSpeeds(List<Integer> fanSpeeds) {
		this.fanSpeeds = fanSpeeds;
	}
	public Double getCpuVoltage() {
		return cpuVoltage;
	}
	public void setCpuVoltage(Double cpuVoltage) {
		this.cpuVoltage = cpuVoltage;
	}
	
	
}
