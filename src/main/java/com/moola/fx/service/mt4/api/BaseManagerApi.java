package com.moola.fx.service.mt4.api;

public interface BaseManagerApi {
  int connect(String server);

  int disconnect();

  int login(int uid, String password);

  boolean isConnected();

  int release();

  String getErrorDescription(int code);

  void reInits(String mt4Dll,String mt4ExtDll);
}
