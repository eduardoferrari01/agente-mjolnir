package br.com.app.scheduled.os;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.api.request.RequestColeta;
import br.com.app.coleta.factory.Coleta;
import br.com.app.coleta.os.FileSystemCollect;
import br.com.app.scheduled.SchedulingTasks;

@Component
public class FileSystemScheduled implements InitializingBean, SchedulingTasks {

	private Coleta coleta;
	private RequestColeta requestColeta;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		coleta = new FileSystemCollect();
		requestColeta = new RequestColeta(RequestMappingEnum.FILE_SYSTEM);
		
	}

	@Scheduled(fixedRate = 500)
	@Override
	public void scheduling() {

		requestColeta.post(coleta);
	}

}
