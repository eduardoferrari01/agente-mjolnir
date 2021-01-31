package br.com.app.coleta.hardware;

import br.com.app.coleta.factory.SystemInfoFactory;

public class NetworkIFsCollect extends ColetaTemplate{

	@Override
	public Object coletar() {

		return SystemInfoFactory.createHardware().getNetworkIFs();
	}
}
