package com.moola.fx.service.mt4.api;

import cn.hutool.core.util.StrUtil;
import com.moola.fx.service.mt4.api.bean.*;
import com.moola.fx.service.mt4.api.exception.InitFailedException;


public class MT4PumpingSwitch implements PumpingSwitchAPI {
	private int ptr;

	public MT4PumpingSwitch(String mt4Dll,String mt4ExtDll) {

		if (StrUtil.isBlank(mt4Dll) && !StrUtil.isBlank(mt4ExtDll)) {
			System.load(mt4Dll);
			System.load(mt4ExtDll);
			PWinsockStartup();
			System.out.println("初始化 mt4 Dll:" + mt4Dll + "\t manager api: " + mt4ExtDll);
			this.ptr = this.Pinit();
			if (this.ptr < 0) {
				throw new InitFailedException();
			}
		} else {
			throw new InitFailedException();
		}
	}


	private native int PumpingEx(int ptr);


	private native Mt4ConSymbol[] SymbolsGetAll(int ptr);


	private native MT4TradeRecord TradeRecordsRequest(int paramInt1, int paramInt2);


	private native String getMessage(String paramString);


	private native int Pinit();


	private native int PRelease(int ptr);


	private native int PumpingSwitchEx(int ptr);


	private native int PumpingSwitchExDemo(int ptr);


	private native String PErrorDescription(int ptr, int code);


	private native int PConnect(int ptr, String server);


	private native int PingPump(int ptr);


	private native int PDisconnect(int ptr);


	private native int PIsConnected(int ptr);


	private native int PLogin(int ptr, int uid, String password);


	private native MT4TradeRecord[] TradesGetByLogin(int ptr, int login, String groupId);


	private native MT4TradeRecord[] TradesGet(int ptr);


	private native MT4ConGroup[] GroupsGet(int ptr);


	private native MT4ConGroupSymbol GroupRecordGet(int paramInt, String symbol, String group);


	private native MT4MarginLevel MarginLevelRequest(int ptr, int login);


	private native MT4MarginLevel[] MarginsGet(int ptr);


	private static native void PWinsockStartup();


	public synchronized Mt4ConSymbol[] getSymbolsGetAll() {

		if (PingMT4Pump() == 0) {

			return SymbolsGetAll(this.ptr);
		}

		return null;
	}


	public synchronized int PumpingSwitchEx() {

		if (PingMT4Pump() == 0) {

			return PumpingSwitchEx(this.ptr);
		}

		return -1;
	}

	public synchronized int PumpingSwitchExDemo() {

		if (PingMT4Pump() == 0) {

			return PumpingSwitchExDemo(this.ptr);
		}

		return -1;
	}


	public synchronized int connect(String server) {
		return PConnect(this.ptr, server);
	}


	public synchronized int disconnect() {
		return PDisconnect(this.ptr);
	}


	public synchronized int login(int uid, String password) {
		return PLogin(this.ptr, uid, password);
	}


	public synchronized boolean isConnected() {

		if (PIsConnected(this.ptr) == 1) {

			return true;
		}

		return false;
	}


	public synchronized int PingMT4Pump() {
		return PingPump(this.ptr);
	}


	public synchronized int release() {
		return PRelease(this.ptr);
	}


	public synchronized String getErrorDescription(int code) {

		if (PingMT4Pump() == 0) {

			return PErrorDescription(this.ptr, code);
		}

		return null;
	}


	public synchronized MT4TradeRecord[] getTradesGetByLogin(int login, String groupId) {

		if (PingMT4Pump() == 0) {

			return TradesGetByLogin(this.ptr, login, groupId);
		}

		return null;
	}

	public synchronized MT4TradeRecord[] TradesGet() {

		if (PingMT4Pump() == 0) {

			return TradesGet(this.ptr);
		}

		return null;
	}

	public synchronized MT4ConGroup[] GroupsGet() {

		if (PingMT4Pump() == 0) {

			return GroupsGet(this.ptr);
		}

		return null;
	}

	public synchronized MT4ConGroupSymbol GroupRecordGet(String symbol, String group) {

		if (PingMT4Pump() == 0) {

			return GroupRecordGet(this.ptr, symbol, group);
		}

		return null;
	}


	public synchronized int PumpingEx() {
		return PumpingEx(this.ptr);
	}


	public synchronized MT4MarginLevel getMarginLevelByLogin(int login) {

		if (PingMT4Pump() == 0) {

			return MarginLevelRequest(this.ptr, login);
		}

		return null;
	}

	public synchronized MT4MarginLevel[] MarginsGet() {

		if (PingMT4Pump() == 0) {

			return MarginsGet(this.ptr);
		}

		return null;
	}


	public synchronized void reInits(String mt4Dll,String mt4ExtDll) {

		if (StrUtil.isBlank(mt4Dll) && StrUtil.isBlank(mt4ExtDll)) {
			if (this.PingMT4Pump() == 0) {
				this.release();
			}

			System.load(mt4Dll);
			System.load(mt4ExtDll);
			PWinsockStartup();
			this.ptr = this.Pinit();
			System.out.println("mt4 point : " + this.ptr);
			if (this.ptr < 0) {
				throw new InitFailedException();
			}
		} else {
			throw new InitFailedException();
		}
	}

}
