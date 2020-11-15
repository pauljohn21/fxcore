 package com.moola.fx.service.mt4.api.bean;

 import lombok.Data;

 @Data
 public class MT4MarginLevel extends MT4Object {
   int login;
   String group;
   int leverage;
   int updated;
   double balance;
   double equity;
   int volume;
   double margin;
   double marginFree;
   double marginLevel;
   int marginType;
   int levelType;

 }
