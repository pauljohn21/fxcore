package com.moola.fx.service.mt4.api.bean;

import lombok.Data;

@Data
public class ConGroupSec extends MT4Object {
	int show;
	int trade;
	int execution;
	double comm_base;
	int comm_type;
	int comm_lots;
	double comm_agent;
	int comm_agent_type;
	int spread_diff;
	int lot_min;
	int lot_max;
	int lot_step;
	int ie_deviation;
	int confirmation;
	int trade_rights;
	int ie_quick_mode;
	int autocloseout_mode;
	double comm_tax;
	int comm_agent_lots;
	int freemargin_mode;
	int index;
	int pos;
	String name;
	String description;
}
