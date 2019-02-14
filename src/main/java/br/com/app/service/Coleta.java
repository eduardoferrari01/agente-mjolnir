package br.com.app.service;

import java.io.IOException;
import java.time.LocalDateTime;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.node.ObjectNode;
import br.com.app.model.ColetaResultado;
import br.com.app.util.Hash;
import oshi.json.SystemInfo;
import oshi.json.hardware.NetworkIF;
import oshi.json.software.os.NetworkParams;


public class Coleta {

  private static Coleta instance;

  private Coleta() {

  }

  public static Coleta getInstance() {

    if (instance == null) {
      instance = new Coleta();
    }
    return instance;
  }

  public ColetaResultado coletar() {
    SystemInfo si = new SystemInfo();

    System.out.println("Coletando.. :" + LocalDateTime.now());

    return buildResult(si.toPrettyJSON());

  }

  public NetworkIF[] coletarNetworkIF() {

    return new SystemInfo().getHardware().getNetworkIFs();

  }

  public NetworkParams getNetworkParams() {

    return new SystemInfo().getOperatingSystem().getNetworkParams();
  }

  private ColetaResultado buildResult(String json) {

    ColetaResultado resultado = new ColetaResultado();
    resultado.setJson(addHashNoJson(json));
    resultado.setScanDateTime(LocalDateTime.now());
    return resultado;

  }

  private String addHashNoJson(String json) {
    ObjectMapper mapper = new ObjectMapper();
    ObjectReader reader = mapper.reader();
    JsonNode node = null;
    try {
      node = reader.readTree(json);
      ((ObjectNode) node).put("hash", Hash.getInstance().getHash());

    } catch (IOException e) {

      e.printStackTrace();
    }
    return node.toString();
  }


}
