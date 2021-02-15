package br.com.app.coleta.system;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.app.coleta.factory.Coleta;
import br.com.app.coleta.os.FileSystemCollect;
import br.com.app.coleta.os.InternetProtocolStatsCollect;
import br.com.app.coleta.os.NetworkParamsCollect;
import br.com.app.coleta.os.OperatingSystemCollect;
import br.com.app.coleta.os.ServicesCollect;
import br.com.app.coleta.os.SessionsCollect;
import br.com.app.coleta.os.VersionInfoCollect;
import br.com.app.model.ColetaResultado;
import br.com.app.util.Hash;

public class OSCollectTest {

	@Test
	public void deveRetornarUmOperatingSystemCollect() {

		Coleta operatingSystem = new OperatingSystemCollect();
		ColetaResultado coletaResultado = operatingSystem.coletaResultadoBuilder();
		coletaResultadoIsValid(coletaResultado);

	}

	@Test
	public void deveRetornarUmFileSystemCollect() {

		Coleta fileSystemCollect = new FileSystemCollect();

		ColetaResultado coletaResultado = fileSystemCollect.coletaResultadoBuilder();
		coletaResultadoIsValid(coletaResultado);
	}

	@Test
	public void deveRetornarUmInternetProtocolStatsCollect() {

		Coleta internetProtocolStatsCollect = new InternetProtocolStatsCollect();
		ColetaResultado coletaResultado = internetProtocolStatsCollect.coletaResultadoBuilder();
		coletaResultadoIsValid(coletaResultado);

	}

	@Test
	public void NetworkParamsCollect() {

		Coleta networkParamsCollect = new NetworkParamsCollect();
		ColetaResultado coletaResultado = networkParamsCollect.coletaResultadoBuilder();
		coletaResultadoIsValid(coletaResultado);
	}

	@Test
	public void ServicesCollect() {

		Coleta servicesCollect = new ServicesCollect();
		ColetaResultado coletaResultado = servicesCollect.coletaResultadoBuilder();
		coletaResultadoIsValid(coletaResultado);
	}

	@Test
	public void SessionsCollect() {
		
		Coleta sessionsCollect = new SessionsCollect();
		ColetaResultado coletaResultado = sessionsCollect.coletaResultadoBuilder();
		coletaResultadoIsValid(coletaResultado);
	}

	@Test
	public void VersionInfoCollect() {
		
		Coleta versionInfoCollect = new VersionInfoCollect();
		ColetaResultado coletaResultado = versionInfoCollect.coletaResultadoBuilder();
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
