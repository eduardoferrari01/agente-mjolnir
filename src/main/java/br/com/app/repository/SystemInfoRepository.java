package br.com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.domain.SystemInfoEntity;

public interface SystemInfoRepository extends JpaRepository<SystemInfoEntity,String>{

}
