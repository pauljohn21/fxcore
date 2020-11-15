package com.moola.fx.service.mt4.api.bean;

import lombok.Data;

@Data
public class MT4GroupCommandInfo extends MT4Object {
	private int len = 1;

	private int command = 0;
	private int leverage = 0;

	private String newgroup;

	private String reserved;


}
