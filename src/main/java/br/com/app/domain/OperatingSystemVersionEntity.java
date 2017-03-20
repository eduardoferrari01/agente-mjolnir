package br.com.app.domain;

import oshi.software.os.OperatingSystemVersion;

public class OperatingSystemVersionEntity {

	private String version;
	private String codeName;
	private String buildNumber;
	
	public OperatingSystemVersionEntity() {}
	public OperatingSystemVersionEntity(OperatingSystemVersion operatingSystemVersion )
	{
		this.version = operatingSystemVersion.getVersion();
		this.codeName = operatingSystemVersion.getCodeName();
		this.buildNumber = operatingSystemVersion.getBuildNumber();
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getBuildNumber() {
		return buildNumber;
	}
	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}
	
	
	
}
