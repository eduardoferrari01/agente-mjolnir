package br.com.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.app.model.ColetaResultado;

public interface ColetaRepository extends JpaRepository<ColetaResultado, Long> {

  List<ColetaResultado> findByEnviadoStatus(Boolean status);

  ColetaResultado findFirstByOrderByScanDateTimeDesc();

}
