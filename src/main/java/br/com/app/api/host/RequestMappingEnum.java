package br.com.app.api.host;

public enum RequestMappingEnum {
	MEMORY("memory"), PROCESSOR("processor"), SENSORS("sensors"), GRAPHICS_CARDS("graphicscards"),
	COMPUTER_SYSTEM("computersystem"), DISK_STORES("diskstores"), DISPLAYS("displays"), NETWORKIFS("networkifs"),
	POWER_SOURCES("powersources");

	private String value;

	public String getHost() {
		return value;
	}

	RequestMappingEnum(String value) {
		this.value = value;
	}

}
