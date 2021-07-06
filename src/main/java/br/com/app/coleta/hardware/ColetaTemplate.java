package br.com.app.coleta.hardware;

import br.com.app.coleta.factory.Coleta;
import br.com.app.model.ColetaResultado;

public abstract class ColetaTemplate implements Coleta{

	@Override
	public ColetaResultado coletaResultadoBuilder() {
 
		return 	new ColetaResultado.Builder(coletar()).build(); 
		 
	}
	
	public abstract Object coletar();
}
