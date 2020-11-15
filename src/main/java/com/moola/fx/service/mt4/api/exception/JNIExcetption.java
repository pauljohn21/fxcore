package com.moola.fx.service.mt4.api.exception;

public class JNIExcetption
	extends Exception {
	JNIExcetption(String msg) {
		super(msg);
		System.out.println("------------------------------JNIExcetption-------------------------" + msg);
	}


	public String getMessage() {
		return super.getMessage();
	}
}

