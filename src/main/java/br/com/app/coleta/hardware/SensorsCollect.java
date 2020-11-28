package br.com.app.coleta.hardware;

import br.com.app.coleta.factory.Coleta;
import br.com.app.coleta.factory.SystemInfoAbstract;
import br.com.app.model.ColetaResultado;

public class SensorsCollect extends SystemInfoAbstract implements Coleta {

	@Override
	public ColetaResultado coletar() {

		return 	new ColetaResultado.Builder(hardware.getSensors()).build();
	}
}
