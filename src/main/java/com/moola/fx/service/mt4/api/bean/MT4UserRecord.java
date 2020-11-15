 package com.moola.fx.service.mt4.api.bean;

 import lombok.Data;

 @Data
 public class MT4UserRecord extends MT4Object {
   public int login = 0;
   public String group = "";
   public String password = "";
   public int enable = 1;
   public int enable_change_password = 1;
   public int enable_read_only = 0;


   public int enable_otp;

   public String password_investor = "";
   public String password_phone = "";
   public String name = "";
   public String country = "";
   public String city = "";
   public String state = "";
   public String zipcode = "";
   public String address = "";
   public String lead_source = "";
   public String phone = "";
   public String email = "";
   public String comment = "";
   public String id = "";
   public String status = "";
   public int regdate = 0;
   public int lastdate = 0;

   public int leverage = 0;
   public int agent_account;
   public int timestamp = 0;

   public int last_ip;

   public double balance;
   public double prevmonthbalance;
   public double prevbalance;
   public double credit;
   public double interestrate;
   public double taxes;
   public double prevmonthequity;
   public double prevequity;
   public String publickey = "";


   public int send_reports;


   public int mqid;

   public String g_name = "";
   public String info = "";


   public MT4UserRecord() {}

   public MT4UserRecord(MT4UserRecord newClient) {
     this.name = newClient.name;
     this.group = newClient.group;
     this.g_name = newClient.g_name;
     this.info = newClient.info;

     this.address = newClient.address;
     this.city = newClient.city;
     this.country = newClient.country;
     this.enable = newClient.enable;
     this.email = newClient.email;
     this.id = newClient.id;

     this.leverage = newClient.leverage;
     this.phone = newClient.phone;
     this.state = newClient.state;
     this.zipcode = newClient.zipcode;
   }

 }


