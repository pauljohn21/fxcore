package com.moola.fx.service.mt4.api;


import cn.hutool.core.util.StrUtil;
import com.moola.fx.service.mt4.api.bean.MT4MarginLevel;
import com.moola.fx.service.mt4.api.bean.MT4TradeRecord;
import com.moola.fx.service.mt4.api.bean.MT4TradeTransInfo;
import com.moola.fx.service.mt4.api.bean.MT4UserRecord;
import com.moola.fx.service.mt4.api.exception.InitFailedException;


public class MT4 implements ManagerAPI {
	private int ptr;

	public MT4(String mt4Dll,String mt4ExtDll) {
		if (!StrUtil.isBlank(mt4Dll) && !StrUtil.isBlank(mt4ExtDll)) {
			System.load(mt4Dll);
			System.load(mt4ExtDll);
			WinsockStartup();
			System.out.println("初始化 mt Dll:" + mt4Dll + "\t manager api: " + mt4ExtDll);
			this.ptr = this.init();
			if (this.ptr < 0) {
				throw new InitFailedException();
			}
		} else {
			throw new InitFailedException();
		}
	}



	private native int init();


	private native int Ping(int ptr);


	private native int Release(int ptr);


	private native int PumpingSwitchEx(int ptr);


	private native String ErrorDescription(int ptr, int code);


	private native int Connect(int ptr, String server);


	private native int Disconnect(int ptr);


	private native int IsConnected(int ptr);


	private native int Login(int ptr, int uid, String password);


	private native MT4UserRecord[] UserRecordsRequest(int ptr, int login);


	private native MT4UserRecord UserRecordNew(int ptr, String userRecord);


	private native int UserRecordUpdate(int ptr, String userRecord);


	private native MT4UserRecord[] UsersRequest(int ptr);


	private native MT4TradeRecord TradeRecordsRequest(int ptr, int orderId);


	private native MT4TradeRecord TradeRecordGet(int ptr, int orderId);


	private native MT4TradeRecord[] TradesRequest(int ptr);


	private native MT4TradeTransInfo[] TradesUserHistory(int ptr);


	private native MT4TradeRecord[] TradesUserHistory(int ptr, int login, int from, int to);


	private native int TradeTransaction(int ptr, String transactionInfo);


	private native int AdmTradeRecordModify(int ptr, String tradeRecord);


	private native int UsersGroupOp(int ptr, String mt4GroupCommandInfo, int login);


	private native int UserPasswordCheck(int ptr, int login, String password);


	private native int UserPasswordSet(int ptr, int login, String password, int change_investor, int clean_pubkey);


	private native MT4MarginLevel MarginLevelRequest(int ptr, int login);


	private static native void WinsockStartup();


	public synchronized int release() {
		return Release(this.ptr);
	}


	public synchronized String getErrorDescription(int code) {

		if (PingMT4() == 0) {

			return ErrorDescription(this.ptr, code);
		}

		return null;
	}


	public synchronized int connect(String server) {
		return Connect(this.ptr, server);
	}


	public synchronized int disconnect() {
		return Disconnect(this.ptr);
	}


	public synchronized boolean isConnected() {

		if (IsConnected(this.ptr) == 1) {

			return true;
		}

		return false;
	}


	public synchronized int PingMT4() {
		return Ping(this.ptr);
	}


	public synchronized int login(int uid, String password) {
		return Login(this.ptr, uid, password);
	}


	public synchronized MT4UserRecord[] getUserRecordByLogin(int login) {

		if (PingMT4() == 0) {
			return UserRecordsRequest(this.ptr, login);
		}

		return null;
	}

	public synchronized MT4UserRecord addUserRecordNew(String userRecord) {

		if (PingMT4() == 0) {

			return UserRecordNew(this.ptr, userRecord);
		}

		return null;
	}


	public synchronized int modifyUserRecordUpdate(String userRecord) {

		if (PingMT4() == 0) {

			return UserRecordUpdate(this.ptr, userRecord);
		}

		return -1;
	}

	public synchronized MT4UserRecord[] getUsersRequest() {

		if (PingMT4() == 0) {

			return UsersRequest(this.ptr);
		}

		return null;
	}

	public synchronized MT4TradeRecord TradeRecordGetByOrder(int orderId) {

		if (PingMT4() == 0) {

			return TradeRecordsRequest(this.ptr, orderId);
		}

		return null;
	}


	public synchronized MT4TradeRecord[] getTradesRequest() {

		if (PingMT4() == 0) {

			return TradesRequest(this.ptr);
		}

		return null;
	}

	public synchronized int addTradeTransaction(String transactionInfo) {

		if (PingMT4() == 0) {

			return TradeTransaction(this.ptr, transactionInfo);
		}

		return -1;
	}

	public synchronized int updateAdmTradeRecordModify(String tradeRecord) {

		if (PingMT4() == 0) {

			return AdmTradeRecordModify(this.ptr, tradeRecord);
		}

		return -1;
	}

	public synchronized int UsersGroupOp(String mt4GroupCommandInfo, int login) {

		if (PingMT4() == 0) {

			return UsersGroupOp(this.ptr, mt4GroupCommandInfo, login);
		}
		/* 260 */
		return -1;
	}

	public synchronized MT4TradeRecord[] getTradesUserHistory(int login, int from, int to) {

		if (PingMT4() == 0) {

			return TradesUserHistory(this.ptr, login, from, to);
		}

		return null;
	}


	public synchronized int UserPasswordCheck(int login, String password) {

		if (PingMT4() == 0) {

			return UserPasswordCheck(this.ptr, login, password);
		}

		return -1;
	}

	public synchronized int UserPasswordSet(int login, String password, int change_investor, int clean_pubkey) {

		if (PingMT4() == 0) {

			return UserPasswordSet(this.ptr, login, password, change_investor, clean_pubkey);
		}

		return -1;
	}


	public synchronized MT4MarginLevel getMarginLevelByLogin(int login) {

		if (PingMT4() == 0) {
			return MarginLevelRequest(this.ptr, login);
		}

		return null;
	}

	public synchronized void reInits(String mt4Dll,String mt4ExtDll) {

		if (!StrUtil.isBlank(mt4Dll) && !StrUtil.isBlank(mt4ExtDll)) {
			if (this.PingMT4() == 0) {
				this.release();
			}

			System.load(mt4Dll);
			System.load(mt4ExtDll);
			WinsockStartup();
			this.ptr = this.init();
			System.out.println("mt point : " + this.ptr);
			if (this.ptr < 0) {
				throw new InitFailedException();
			}
		} else {
			throw new InitFailedException();
		}

	}
}

