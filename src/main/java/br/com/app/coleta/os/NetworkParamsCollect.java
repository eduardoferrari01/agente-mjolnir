package br.com.app.coleta.os;

import br.com.app.coleta.factory.SystemInfoFactory;
import br.com.app.coleta.hardware.ColetaTemplate;

public class NetworkParamsCollect extends ColetaTemplate{

	@Override
	public Object coletar() {
		return SystemInfoFactory.createOperatingSystem().getNetworkParams();
	}

}