package br.com.app.api.host;

public enum RequestMappingEnum {
	MEMORY("memory"), PROCESSOR("processor"), SENSORS("sensors"), GRAPHICS_CARDS("graphicscards"),
	COMPUTER_SYSTEM("computersystem"), DISK_STORES("diskstores"), DISPLAYS("displays"), NETWORKIFS("networkifs"),
	POWER_SOURCES("powersources"), CONFIG_CREATE("config"), FILE_SYSTEM("filesystem"),
	INTERNET_PROTOCOLSTATS("internetprotocolstats"), NETWORK_PARAMS("networkparams"),
	OPERATING_SYSTEM("operatingsystem"),PROCESSES("processe"), SERVICES("services"), SESSIONS("sessions"), VERSION_INFO("versioninfo");

	private String value;

	public String getHost() {
		return value;
	}

	RequestMappingEnum(String value) {
		this.value = value;
	}

}
