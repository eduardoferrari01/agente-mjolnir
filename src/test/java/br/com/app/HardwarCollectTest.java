package br.com.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.app.coleta.factory.Coleta;
import br.com.app.coleta.hardware.ComputerSystemCollect;
import br.com.app.coleta.hardware.DiskStoresCollect;
import br.com.app.coleta.hardware.DisplaysCollect;
import br.com.app.coleta.hardware.GraphicsCardsCollect;
import br.com.app.coleta.hardware.MemoryCollect;
import br.com.app.coleta.hardware.NetworkIFsCollect;
import br.com.app.coleta.hardware.PowerSourcesCollect;
import br.com.app.coleta.hardware.ProcessorCollect;
import br.com.app.coleta.hardware.SensorsCollect;
import br.com.app.model.ColetaResultado;
import br.com.app.util.Hash;

public class HardwarCollectTest {

	@Test
	public void deveRetornarUmComputerSystemCollect() {
		
		Coleta computerSystemCollect = new ComputerSystemCollect();
		
		ColetaResultado coletaResultado =  computerSystemCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	@Test
	public void deveRetornarUmProcessorCollect() {
		
		Coleta processorCollect = new ProcessorCollect();
		
		ColetaResultado coletaResultado =  processorCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	@Test
	public void deveRetornarUmSensorsCollect() {
		
		Coleta sensorsCollect = new SensorsCollect();
		
		ColetaResultado coletaResultado =  sensorsCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	@Test
	public void deveRetornarUmPowerSourcesCollect() {
		
		Coleta powerSourcesCollect = new PowerSourcesCollect();
		
		ColetaResultado coletaResultado =  powerSourcesCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	@Test
	public void deveRetornarUmNetworkIFsCollect() {
		
		Coleta networkIFsCollect = new NetworkIFsCollect();
		
		ColetaResultado coletaResultado =  networkIFsCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	
	@Test
	public void deveRetornarUmMemoryCollect() {
		
		Coleta memoryCollect = new MemoryCollect();
		
		ColetaResultado coletaResultado =  memoryCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	@Test
	public void deveRetornarUmGraphicsCardsCollect() {
		
		Coleta graphicsCardsCollect = new GraphicsCardsCollect();
		
		ColetaResultado coletaResultado =  graphicsCardsCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	@Test
	public void deveRetornarUmDisplaysCollect() {
		
		Coleta displaysCollect = new DisplaysCollect();
		
		ColetaResultado coletaResultado =  displaysCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	@Test
	public void deveRetornarUmDiskStoresCollect() {
		
		Coleta diskStoresCollect = new DiskStoresCollect();
		
		ColetaResultado coletaResultado =  diskStoresCollect.coletar();
		coletaResultadoIsValid(coletaResultado);
	}
	
	private void coletaResultadoIsValid(ColetaResultado coletaResultado) {
		
		String hash = new Hash().findHash();
		
		assertNotNull(coletaResultado);
		assertEquals(hash, coletaResultado.getId());
		assertNotNull(coletaResultado.getJson());
		assertTrue(!coletaResultado.getJson().isEmpty());
		assertNotNull(coletaResultado.toJson());
		assertTrue(!coletaResultado.toJson().isEmpty());
	}
}
