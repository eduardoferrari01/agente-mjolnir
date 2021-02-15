package br.com.app.coleta.system;

import br.com.app.coleta.factory.SystemInfoFactory;
import br.com.app.coleta.hardware.ColetaTemplate;

public class VersionInfoCollect extends ColetaTemplate{

	@Override
	public Object coletar() {
		return SystemInfoFactory.createOperatingSystem().getVersionInfo();
	}

}
