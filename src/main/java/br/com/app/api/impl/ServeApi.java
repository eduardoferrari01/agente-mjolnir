package br.com.app.api.impl;

public interface ServeApi {
    String post(String json);
    String get();
    String get(String variables);
}
