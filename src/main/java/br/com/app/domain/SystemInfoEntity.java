package br.com.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import oshi.SystemInfo;

@Entity
public class SystemInfoEntity {

	 @Id
	 @Column(updatable = false, nullable = false)
	 private String id;
	 
	 @Transient
	 private OperatingSystemEntity os ;
	 @Transient 
	 private HardwareAbstractionLayerEntity hardware;
	
	 public SystemInfoEntity(){}
	 public SystemInfoEntity(SystemInfo systemInfo) {
		 
		 os = new OperatingSystemEntity(systemInfo.getOperatingSystem());
		 hardware = new HardwareAbstractionLayerEntity(systemInfo.getHardware());
		 
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public OperatingSystemEntity getOs() {
		return os;
	}

	public void setOs(OperatingSystemEntity os) {
		this.os = os;
	}

	public HardwareAbstractionLayerEntity getHardware() {
		return hardware;
	}

	public void setHardware(HardwareAbstractionLayerEntity hardware) {
		this.hardware = hardware;
	}
	 
}
