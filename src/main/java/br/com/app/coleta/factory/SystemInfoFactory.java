package br.com.app.coleta.factory;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class SystemInfoFactory {

	private static SystemInfo systemInfo;

	public static HardwareAbstractionLayer createHardware() {
		
		instanceCreate();
		return systemInfo.getHardware();

	}

	public static OperatingSystem createOperatingSystem() {

		instanceCreate();
		return systemInfo.getOperatingSystem();

	}
	
	private static void instanceCreate() {

		if (systemInfo == null) {
			systemInfo = new SystemInfo();
		}
		
	}


}
