package br.com.app.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.app.domain.SystemInfoEntity;
import br.com.app.repository.SystemInfoRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class SystemInfoService {

	@Autowired
	SystemInfoRepository repository;
	
	public void salvarOuEditar(SystemInfoEntity systemInfo)
	{
		repository.save(systemInfo);
	}
}
