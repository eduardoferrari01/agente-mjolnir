package br.com.app.api.impl;

import br.com.app.model.ColetaResultado;

 
public interface ServeApi {
    void enviar(String host, ColetaResultado coletaResultado);
}
