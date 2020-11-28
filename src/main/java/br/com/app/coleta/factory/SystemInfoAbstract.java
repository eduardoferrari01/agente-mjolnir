package br.com.app.coleta.factory;

import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public abstract class SystemInfoAbstract {
	
	protected HardwareAbstractionLayer hardware = null;
	protected OperatingSystem operatingSystem = null;
	
	public SystemInfoAbstract() {
		
		hardware = SystemInfoFactory.createHardware();
		operatingSystem = SystemInfoFactory.createOperatingSystem();
	}
}
