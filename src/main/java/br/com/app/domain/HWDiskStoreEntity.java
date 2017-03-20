package br.com.app.domain;

import java.util.ArrayList;
import java.util.List;

import oshi.hardware.HWDiskStore;
import oshi.hardware.HWPartition;

public class HWDiskStoreEntity {

	private String model;
    private String name;
    private String serial;
    private Long size;
    private Long reads;
    private Long readBytes;
    private Long writes;
    private Long writeBytes;
    private Long transferTime;
    private List<HWPartitionEntity> partitions;
    private Long timeStamp;
	
    public HWDiskStoreEntity(){}
    public HWDiskStoreEntity(HWDiskStore hWDiskStore)
    {
    	this.model = hWDiskStore.getModel();
    	this.name = hWDiskStore.getName();
    	this.serial = hWDiskStore.getSerial();
    	this.size = hWDiskStore.getSize();
    	this.reads = hWDiskStore.getReads();
    	this.readBytes = hWDiskStore.getReadBytes();
    	this.writes = hWDiskStore.getWrites();
    	this.writeBytes =hWDiskStore.getWriteBytes();
    	this.transferTime = hWDiskStore.getTransferTime();
    	this.partitions = new ArrayList<HWPartitionEntity>();
    	for(HWPartition hWPartition : hWDiskStore.getPartitions())
    	{
    		HWPartitionEntity hWPartitionEntity = new HWPartitionEntity(hWPartition);
    		partitions.add(hWPartitionEntity);
    		 
    	}
    	this.timeStamp = hWDiskStore.getTimeStamp();
    }
    
    public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public Long getReads() {
		return reads;
	}
	public void setReads(Long reads) {
		this.reads = reads;
	}
	public Long getReadBytes() {
		return readBytes;
	}
	public void setReadBytes(Long readBytes) {
		this.readBytes = readBytes;
	}
	public Long getWrites() {
		return writes;
	}
	public void setWrites(Long writes) {
		this.writes = writes;
	}
	public Long getWriteBytes() {
		return writeBytes;
	}
	public void setWriteBytes(Long writeBytes) {
		this.writeBytes = writeBytes;
	}
	public Long getTransferTime() {
		return transferTime;
	}
	public void setTransferTime(Long transferTime) {
		this.transferTime = transferTime;
	}
	public List<HWPartitionEntity> getPartitions() {
		return partitions;
	}
	public void setPartitions(List<HWPartitionEntity> partitions) {
		this.partitions = partitions;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
    
    
    
    
}
