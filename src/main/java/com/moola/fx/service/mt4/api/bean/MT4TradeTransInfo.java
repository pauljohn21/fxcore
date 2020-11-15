package com.moola.fx.service.mt4.api.bean;

import lombok.Data;

@Data
public class MT4TradeTransInfo extends MT4Object {
	private int type = 0;
	private int flags = 0;
	private int cmd = 0;
	private int order = 0;
	private int orderby = 0;
	private String symbol = "";
	int volume = 0;
	private float price = 0.0F;
	private float sl = 0.0F;
	private float tp = 0.0F;
	private int ie_deviation = 0;
	private String comment = "";
	private int expiration = 0;
	private int crc = 0;


}

