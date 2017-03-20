package br.com.app.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.app.repository.SystemInfoRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class VerificaBanco {

	@Autowired
	private SystemInfoRepository repository;
	
	public Boolean verificarSeExisteId()
	{
		if(repository.count() > 0)
		{
			return true;
		}else
		{
		return false;
		}
	}
	public String getId()
	{
		return repository.findAll().get(0).getId();
	}
}
