package com.moola.fx.service.mt4.api.bean;

import lombok.Data;

@Data
public class Mt4ConSymbol extends MT4Object {
	private String symbol;
	private String description;
	private String source;
	private String currency;
	private int type;
	private int digits;
	private int trade;
	private int count;
	private int count_original;
	private int realtime;
	private String starting;
	private String expiration;
	private int profit_mode;
	private int profit_reserved;
	private int filter;
	private int filter_counter;
	private double filter_limit;
	private int filter_smoothing;
	private float filter_reserved;
	private int logging;
	private int spread;
	private int spread_balance;
	private int exemode;
	private int swap_enable;
	private int swap_type;
	private double swap_long;
	private double swap_short;
	private int swap_rollover3days;
	private double contract_size;
	private double tick_value;
	private double tick_size;
	private int stops_level;
	private int gtc_pendings;
	private int margin_mode;
	private double margin_initial;
	private double margin_maintenance;
	private double margin_hedged;
	private double margin_divider;
	private double point;
	private double multiply;
	private double bid_tickvalue;
	private double ask_tickvalue;
	private int long_only;
	private int instant_max_volume;
	private String margin_currency;
	private int freeze_level;
	private int margin_hedged_strong;
	private int quotes_delay;
	private int swap_openprice;
	private int swap_variation_margin;


}

