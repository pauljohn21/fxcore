 package com.moola.fx.service.mt4.api.bean;

// import com.moola.fx.fxbook.modules.warn.entity.WarnParamJson;
 import lombok.Data;

 @Data
 public class OrderBean extends MT4Object {
   public String dealer;
   public int order = 0;
   public String accountName;
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
   private String timestampString;
   public int gw_volume = 0;

   public String conv_reserv;
   public String gw_order;
   public int gw_open_price = 0;
   public int gw_close_price = 0;
   public int orderStatus = 0;

//   private WarnParamJson warnParamJson;

   private double margin = 0.0D;



 }

