package com.moola.fx.service.mt4.api;

import com.moola.fx.service.mt4.api.bean.MT4MarginLevel;
import com.moola.fx.service.mt4.api.bean.MT4TradeRecord;
import com.moola.fx.service.mt4.api.bean.MT4UserRecord;

public interface ManagerAPI extends BaseManagerApi {
  MT4UserRecord[] getUserRecordByLogin(int login);

  MT4UserRecord addUserRecordNew(String userRecord);

  int modifyUserRecordUpdate(String userRecord);

  int PingMT4();

  MT4UserRecord[] getUsersRequest();

  MT4TradeRecord TradeRecordGetByOrder(int orderId);

  int updateAdmTradeRecordModify(String tradeRecord);

  int UsersGroupOp(String mt4GroupCommandInfo, int login);

  MT4TradeRecord[] getTradesRequest();

  MT4TradeRecord[] getTradesUserHistory(int login, int from, int to);

  int addTradeTransaction(String transactionInfo);

  int UserPasswordCheck(int login, String password);

  int UserPasswordSet( int login, String password, int change_investor, int clean_pubkey);

  MT4MarginLevel getMarginLevelByLogin(int login);
}
