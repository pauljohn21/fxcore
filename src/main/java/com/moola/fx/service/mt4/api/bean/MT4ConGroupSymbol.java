package com.moola.fx.service.mt4.api.bean;

import lombok.Data;

@Data
public class MT4ConGroupSymbol
	extends MT4Object {
	private String group;
	private String symbol;
	private int enable;
	private double req_ask;
	private double req_bid;
	private double ask;
	private double bid;
	private double spread_diff;
	private double digits;
	private double point;
}
