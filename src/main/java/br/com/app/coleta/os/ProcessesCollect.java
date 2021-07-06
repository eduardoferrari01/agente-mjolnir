package br.com.app.coleta.os;

import br.com.app.coleta.factory.SystemInfoFactory;
import br.com.app.coleta.hardware.ColetaTemplate;

public class ProcessesCollect extends  ColetaTemplate {

	@Override
	public Object coletar() {
		 
		return SystemInfoFactory.createOperatingSystem().getProcesses();
	}
}
