//+------------------------------------------------------------------+
//|                                                 MetaTrader 5 API |
//|                   Copyright 2000-2020, MetaQuotes Software Corp. |
//|                                        http://www.metaquotes.net |
//+------------------------------------------------------------------+
#pragma once
//+------------------------------------------------------------------+
//| Messenger config                                                 |
//+------------------------------------------------------------------+
class IMTConMessenger
  {
public:
   //--- allowed flags
   enum EnFlags
     {
      FLAG_NONE               =0, // none
      FLAG_ENABLED            =1, // messenger is enabled
      FLAG_DEFAULT            =2, // messenger is default
      //--- flags borders
      FLAG_FIRST              =FLAG_ENABLED,
      FLAG_ALL                =FLAG_ENABLED|FLAG_DEFAULT
     };
   //--- providers
   enum EnProviderType
     {
      //---- SMS
      PROVIDER_SMS_BULKSMS    =0,
      PROVIDER_SMS_CLICKATELL =1,
      PROVIDER_SMS_WEBSMS     =2,
      PROVIDER_SMS_TWILIO     =3,
      //--- SMS ranges
      PROVIDER_SMS_FIRST      =PROVIDER_SMS_BULKSMS,
      PROVIDER_SMS_LAST       =99,
      //---- Instant Messengers
      PROVIDER_IM_TELEGRAM    =100,
      PROVIDER_IM_WHATSAPP    =101,
      PROVIDER_IM_VIBER       =102,
      //--- Instant Messengers ranges
      PROVIDER_IM_FIRST       =PROVIDER_IM_TELEGRAM,
      PROVIDER_IM_LAST        =199,
      //---- Push Services
      PROVIDER_PUSH_METAQUOTES=200,
      PROVIDER_PUSH_UNIVERSAL =201,
      //--- Push Services ranges
      PROVIDER_PUSH_FIRST     =PROVIDER_PUSH_METAQUOTES,
      PROVIDER_PUSH_LAST      =299,
     };
   //--- common methods
   virtual void      Release(void)=0;
   virtual MTAPIRES  Assign(const IMTConMessenger* messenger)=0;
   virtual MTAPIRES  Clear(void)=0;
   //--- name
   virtual LPCWSTR   Name(void) const=0;
   virtual MTAPIRES  Name(LPCWSTR name)=0;
   //--- sender
   virtual LPCWSTR   Sender(void) const=0;
   virtual MTAPIRES  Sender(LPCWSTR sender)=0;
   //--- provider type
   virtual UINT      ProviderType(void) const=0;
   virtual MTAPIRES  ProviderType(const UINT provider)=0;
   //--- provider address
   virtual LPCWSTR   ProviderAddress(void) const=0;
   virtual MTAPIRES  ProviderAddress(LPCWSTR address)=0;
   //--- provider login
   virtual LPCWSTR   ProviderLogin(void) const=0;
   virtual MTAPIRES  ProviderLogin(LPCWSTR login)=0;
   //--- provider password
   virtual LPCWSTR   ProviderPassword(void) const=0;
   virtual MTAPIRES  ProviderPassword(LPCWSTR password)=0;
   //--- provider token
   virtual LPCWSTR   ProviderToken(void) const=0;
   virtual MTAPIRES  ProviderToken(LPCWSTR token)=0;
   //--- provider SubID
   virtual LPCWSTR   ProviderSubId(void) const=0;
   virtual MTAPIRES  ProviderSubId(LPCWSTR subid)=0;
   //--- provider currency
   virtual LPCWSTR   ProviderCurrency(void) const=0;
   virtual MTAPIRES  ProviderCurrency(LPCWSTR currency)=0;
   //--- provider currency rate
   virtual double    ProviderCurrencyRate(void) const=0;
   virtual MTAPIRES  ProviderCurrencyRate(const double rate)=0;
   //--- EnFlags
   virtual UINT64    Flags(void) const=0;
   virtual MTAPIRES  Flags(const UINT64 flags)=0;
  };
//+------------------------------------------------------------------+
//| Messenger config events notification interface                   |
//+------------------------------------------------------------------+
class IMTConMessengerSink
  {
public:
   virtual void      OnMessengerAdd(const IMTConMessenger*    /*config*/) {  }
   virtual void      OnMessengerUpdate(const IMTConMessenger* /*config*/) {  }
   virtual void      OnMessengerDelete(const IMTConMessenger* /*config*/) {  }
   virtual void      OnMessengerSync(void)                            {  }
  };
//+------------------------------------------------------------------+
