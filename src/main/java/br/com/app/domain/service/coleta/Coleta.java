package br.com.app.domain.service.coleta;

import br.com.app.domain.SystemInfoEntity;
import br.com.app.domain.service.RestTemplateSystemInfo;
import oshi.SystemInfo;

public class Coleta  extends Thread{

	private String id;
	private RestTemplateSystemInfo restTemplate = new RestTemplateSystemInfo();
	public void run() {
        
		while(true)
		{
			
			coletar();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
    }
	private void coletar()
	{
		System.out.println("Coletando...");
		SystemInfo si = new SystemInfo();
		SystemInfoEntity systemInfoEntity  = new SystemInfoEntity(si);
		restTemplate.enviar(systemInfoEntity);
	}
	
	
}
