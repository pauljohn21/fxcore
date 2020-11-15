package com.moola.fx.service.mt4.api;

import com.moola.fx.service.mt4.api.bean.*;

public interface PumpingSwitchAPI extends BaseManagerApi {
  int PumpingEx();

  Mt4ConSymbol[] getSymbolsGetAll();

  int PumpingSwitchEx();

  int PumpingSwitchExDemo();

  MT4TradeRecord[] getTradesGetByLogin(int login, String groupId);

  MT4TradeRecord[] TradesGet();

  MT4ConGroup[] GroupsGet();

  MT4ConGroupSymbol GroupRecordGet(String symbol, String group);

  int PingMT4Pump();

  MT4MarginLevel getMarginLevelByLogin(int login);

  MT4MarginLevel[] MarginsGet();
}

