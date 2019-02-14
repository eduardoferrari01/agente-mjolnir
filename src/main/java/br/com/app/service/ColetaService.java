package br.com.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.app.model.ColetaResultado;
import br.com.app.repository.ColetaRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ColetaService {

  @Autowired
  private ColetaRepository coletaRepositoy;

  @Transactional(readOnly = false)
  public void save(ColetaResultado resultado) {

    coletaRepositoy.save(resultado);
  }

  public ColetaResultado findFirstByOrderByScanDateTimeDesc() {
    return coletaRepositoy.findFirstByOrderByScanDateTimeDesc();
  }

  public List<ColetaResultado> findByStatus(Boolean status) {

    return coletaRepositoy.findByEnviadoStatus(status);
  }



}
