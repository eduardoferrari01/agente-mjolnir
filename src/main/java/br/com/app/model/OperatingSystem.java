package br.com.app.model;

public class OperatingSystem {

	private Integer bitness;
	private	String family;
	private	String manufacturer;
	private	Integer processCount;
	private	Integer processId;
	private	Long systemBootTime;
	private	Long systemUptime;
	private	Integer threadCount;
	
	public Integer getBitness() {
		return bitness;
	}
	public void setBitness(Integer bitness) {
		this.bitness = bitness;
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
	public Integer getProcessCount() {
		return processCount;
	}
	public void setProcessCount(Integer processCount) {
		this.processCount = processCount;
	}
	public Integer getProcessId() {
		return processId;
	}
	public void setProcessId(Integer processId) {
		this.processId = processId;
	}
	public Long getSystemBootTime() {
		return systemBootTime;
	}
	public void setSystemBootTime(Long systemBootTime) {
		this.systemBootTime = systemBootTime;
	}
	public Long getSystemUptime() {
		return systemUptime;
	}
	public void setSystemUptime(Long systemUptime) {
		this.systemUptime = systemUptime;
	}
	public Integer getThreadCount() {
		return threadCount;
	}
	public void setThreadCount(Integer threadCount) {
		this.threadCount = threadCount;
	}
	
	
	
}
