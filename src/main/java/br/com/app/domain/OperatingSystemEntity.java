package br.com.app.domain;


import java.util.ArrayList;
import java.util.List;

import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystem.ProcessSort;


public class OperatingSystemEntity {

	 
//    enum ProcessSortEnum {
//        CPU, MEMORY, OLDEST, NEWEST, PID, PARENTPID, NAME
//    }
//    
    private String family;
    private String manufacturer;
    private OperatingSystemVersionEntity version;
    private FileSystemEntity fileSystem;
    private List<OSProcessEntity> processes;
    private Integer processId;
    private Integer processCount;
    private Integer threadCount;
    private NetworkParamsEntity networkParamsEntity;
    
    public OperatingSystemEntity(){}
    public OperatingSystemEntity(OperatingSystem operatingSystem)
    {
    	this.family = operatingSystem.getFamily();
    	this.manufacturer = operatingSystem.getManufacturer();
    	this.version = new OperatingSystemVersionEntity(operatingSystem.getVersion());
    	this.fileSystem = new FileSystemEntity(operatingSystem.getFileSystem());
    	this.processes = new ArrayList<OSProcessEntity>();
    	for(OSProcess osProcess : operatingSystem.getProcesses(100, ProcessSort.CPU))
    	 {
    		 OSProcessEntity osProcessEntity = new OSProcessEntity(osProcess);
    		 processes.add(osProcessEntity);
    	 }
    	this.processId = operatingSystem.getProcessId();
    	this.processCount = operatingSystem.getProcessCount();
    	this.networkParamsEntity = new NetworkParamsEntity(operatingSystem.getNetworkParams());
    			
    }

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public OperatingSystemVersionEntity getVersion() {
		return version;
	}

	public void setVersion(OperatingSystemVersionEntity version) {
		this.version = version;
	}

	public FileSystemEntity getFileSystem() {
		return fileSystem;
	}

	public void setFileSystem(FileSystemEntity fileSystem) {
		this.fileSystem = fileSystem;
	}
	public List<OSProcessEntity> getProcesses() {
		return processes;
	}

	public void setProcesses(List<OSProcessEntity> processes) {
		this.processes = processes;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getProcessCount() {
		return processCount;
	}

	public void setProcessCount(Integer processCount) {
		this.processCount = processCount;
	}

	public Integer getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(Integer threadCount) {
		this.threadCount = threadCount;
	}

	public NetworkParamsEntity getNetworkParams() {
		return networkParamsEntity;
	}

	public void setNetworkParams(NetworkParamsEntity networkParamsEntity) {
		this.networkParamsEntity = networkParamsEntity;
	}
    
}
