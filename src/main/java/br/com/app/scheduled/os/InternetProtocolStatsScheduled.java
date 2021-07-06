package br.com.app.scheduled.os;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.app.api.host.RequestMappingEnum;
import br.com.app.api.request.RequestColeta;
import br.com.app.coleta.factory.Coleta;
import br.com.app.coleta.os.InternetProtocolStatsCollect;
import br.com.app.scheduled.SchedulingTasks;

@Component
public class InternetProtocolStatsScheduled implements InitializingBean, SchedulingTasks {

	private Coleta coleta;
	private RequestColeta requestColeta;

	@Override
	public void afterPropertiesSet() throws Exception {

		coleta = new InternetProtocolStatsCollect();
		requestColeta = new RequestColeta(RequestMappingEnum.INTERNET_PROTOCOLSTATS);

	}

	@Scheduled(fixedRate = 500)
	@Override
	public void scheduling() {
		requestColeta.post(coleta);

	}

}
