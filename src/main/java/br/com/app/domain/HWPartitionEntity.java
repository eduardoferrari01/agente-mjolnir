package br.com.app.domain;

import oshi.hardware.HWPartition;

public class HWPartitionEntity {

	private String identification;
    private String name;
    private String type;
    private String uuid;
    private Long size;
    private Integer major;
    private Integer minor;
    private String mountPoint;
	
    public HWPartitionEntity() {}
    public HWPartitionEntity(HWPartition hWPartition)
    {
    	this.identification = hWPartition.getIdentification();
    	this.name  = hWPartition.getName();
    	this.type = hWPartition.getType();
    	this.uuid =hWPartition.getUuid();
    	this.size = hWPartition.getSize();
    	this.minor = hWPartition.getMinor();
    	this.major = hWPartition.getMajor();
    	this.mountPoint = hWPartition.getMountPoint();
    }
    public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public Integer getMajor() {
		return major;
	}
	public void setMajor(Integer major) {
		this.major = major;
	}
	public Integer getMinor() {
		return minor;
	}
	public void setMinor(Integer minor) {
		this.minor = minor;
	}
	public String getMountPoint() {
		return mountPoint;
	}
	public void setMountPoint(String mountPoint) {
		this.mountPoint = mountPoint;
	}

    
}
