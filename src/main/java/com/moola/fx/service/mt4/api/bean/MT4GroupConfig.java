package com.moola.fx.service.mt4.api.bean;

import lombok.Data;

import java.util.ArrayList;

@Data
public class MT4GroupConfig extends MT4Object {
	private int p = -1;

	String group;

	int enable;

	int timeout;

	int adv_security;
	String company;
	String signature;
	String support_page;
	String smtp_server;
	String smtp_login;
	String smtp_password;
	String support_email;
	String templates;
	int copies;
	int reports;
	int default_leverage;
	double default_deposit;
	int maxsecurities;
	ArrayList<ConGroupSec> secgroups = new ArrayList<>();
	ArrayList<ConGroupMargin> secmargins = new ArrayList<>();

	int secmargins_total;

	String currency;

	double credit;

	int margin_call;

	int margin_mode;

	int margin_stopout;

	double interestrate;

	int use_swap;

	int news;

	int rights;

	int check_ie_prices;

	int maxpositions;

	int close_reopen;
	int hedge_prohibited;
	int close_fifo;
	int hedge_largeleg;
	int margin_type;
	int archive_period;
	int archive_max_balance;
	int stopout_skip_hedged;
	int archive_pending_period;


	public ConGroupSec getFirstSec() {
		if (this.secgroups.size() <= 0) return null;
		this.p = 1;
		return this.secgroups.get(0);
	}

	public ConGroupSec getNextSec() {
		if (this.p == -1) return getFirstSec();
		if (this.p >= this.secgroups.size()) {
			this.p = -1;
			return null;
		}
		this.p++;
		return this.secgroups.get(this.p - 1);
	}
}

