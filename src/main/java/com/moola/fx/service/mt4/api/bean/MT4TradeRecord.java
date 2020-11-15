package com.moola.fx.service.mt4.api.bean;

import lombok.Data;

@Data
public class MT4TradeRecord extends MT4Object {
	public int order = 0;
	public int login = 0;
	public String symbol = "";

	public int digits;

	public int cmd;
	public int volume;
	public int open_time = 0;
	public int state;
	public double open_price;
	public double sl;
	public double tp;
	public int close_time = 0;
	public int value_date = 0;
	public int expiration = 0;

	public double conv_rates_o;

	public double conv_rates_c;

	public double commission;

	public double commission_agent;
	public double storage;
	public double close_price;
	public double profit;
	public double taxes;
	public int magic;
	public String comment = "";

	public int activation;

	public int spread;

	public double margin_rate;

	public int timestamp = 0;


}

