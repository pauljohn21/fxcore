 package com.moola.fx.service.mt4.api.bean;

 import lombok.Data;

 @Data
 public class HQBean
   extends MT4Object {
	 private String dateType;
	 private String serverContents;
	 private int login = 0;
	 private int cmd = 0;
	 private int order = 0;

	 public String dealer;

	 private String symbol;
	 private double bid;
	 private double ask;
	 private double high;
	 private double low;
	 private int lasttime;
	 private String currency;
	 private String margin_currency;
	 private int type;
	 private int digits;
	 private String point;
	 private int trade;
	 private int count;
	 private int profit_mode;
	 private int margin_mode;
	 private double contract_size;
	 private double margin_initial;
	 private double margin_maintenance;
	 private double margin_hedged;
	 private double tick_size;
	 private double tick_value;
	 private double margin_divider;
	 private double swap_openprice;
 }
