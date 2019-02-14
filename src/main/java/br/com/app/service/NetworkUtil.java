package br.com.app.service;

import java.util.ArrayList;
import java.util.List;
import oshi.json.hardware.NetworkIF;

public class NetworkUtil {

  public List<String> getIps(NetworkIF[] networkIF) {

    List<String> ips = new ArrayList<>();

    for (NetworkIF network : networkIF) {
      for (String ip : network.getIPv6addr()) {
        ips.add(ip);
      }
      for (String ip : network.getIPv4addr()) {
        ips.add(ip);
      }
    }
    return ips;
  }


}
