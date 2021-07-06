package br.com.app.scheduled.hardware;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.api.request.RequestColeta;
import br.com.app.coleta.factory.Coleta;
import br.com.app.coleta.hardware.SensorsCollect;
import br.com.app.scheduled.SchedulingTasks;

@Component
public class SensorsScheduled implements InitializingBean, SchedulingTasks {

	private Coleta sensorColeta;
	private RequestColeta requestColeta;

	@Override
	public void afterPropertiesSet() throws Exception {
		sensorColeta = new SensorsCollect();
		requestColeta = new RequestColeta(RequestMappingEnum.SENSORS);

	}

	@Scheduled(fixedRate = 500)
	@Override
	public void scheduling() {

		requestColeta.post(sensorColeta);

	}
}
