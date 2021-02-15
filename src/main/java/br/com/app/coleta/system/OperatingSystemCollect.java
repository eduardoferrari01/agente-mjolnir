package br.com.app.coleta.system;

import br.com.app.coleta.factory.SystemInfoFactory;
import br.com.app.coleta.hardware.ColetaTemplate;
import br.com.app.model.OperatingSystem;

public class OperatingSystemCollect extends ColetaTemplate {

	@Override
	public Object coletar() {

		OperatingSystem operatingSystem = new OperatingSystem();

		operatingSystem.setBitness(SystemInfoFactory.createOperatingSystem().getBitness());
		operatingSystem.setFamily(SystemInfoFactory.createOperatingSystem().getFamily());
		operatingSystem.setManufacturer(SystemInfoFactory.createOperatingSystem().getManufacturer());
		operatingSystem.setProcessCount(SystemInfoFactory.createOperatingSystem().getProcessCount());
		operatingSystem.setProcessId(SystemInfoFactory.createOperatingSystem().getProcessId());
		operatingSystem.setSystemBootTime(SystemInfoFactory.createOperatingSystem().getSystemBootTime());
		operatingSystem.setSystemUptime(SystemInfoFactory.createOperatingSystem().getSystemUptime());
		operatingSystem.setThreadCount(SystemInfoFactory.createOperatingSystem().getThreadCount());

		return operatingSystem;
	}

}
