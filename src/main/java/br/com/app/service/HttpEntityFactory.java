package br.com.app.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class HttpEntityFactory {

  private String json;

  public HttpEntityFactory(String json) {
    this.json = json;
  }

  public HttpEntity<String> factory() {

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> entity = new HttpEntity<String>(this.json, headers);

    return entity;
  }
}
