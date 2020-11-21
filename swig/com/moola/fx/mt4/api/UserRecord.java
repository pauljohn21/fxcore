/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class UserRecord {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UserRecord(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UserRecord obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mtmanapiJNI.delete_UserRecord(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLogin(int value) {
    mtmanapiJNI.UserRecord_login_set(swigCPtr, this, value);
  }

  public int getLogin() {
    return mtmanapiJNI.UserRecord_login_get(swigCPtr, this);
  }

  public void setGroup(String value) {
    mtmanapiJNI.UserRecord_group_set(swigCPtr, this, value);
  }

  public String getGroup() {
    return mtmanapiJNI.UserRecord_group_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    mtmanapiJNI.UserRecord_password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return mtmanapiJNI.UserRecord_password_get(swigCPtr, this);
  }

  public void setEnable(int value) {
    mtmanapiJNI.UserRecord_enable_set(swigCPtr, this, value);
  }

  public int getEnable() {
    return mtmanapiJNI.UserRecord_enable_get(swigCPtr, this);
  }

  public void setEnable_change_password(int value) {
    mtmanapiJNI.UserRecord_enable_change_password_set(swigCPtr, this, value);
  }

  public int getEnable_change_password() {
    return mtmanapiJNI.UserRecord_enable_change_password_get(swigCPtr, this);
  }

  public void setEnable_read_only(int value) {
    mtmanapiJNI.UserRecord_enable_read_only_set(swigCPtr, this, value);
  }

  public int getEnable_read_only() {
    return mtmanapiJNI.UserRecord_enable_read_only_get(swigCPtr, this);
  }

  public void setEnable_otp(int value) {
    mtmanapiJNI.UserRecord_enable_otp_set(swigCPtr, this, value);
  }

  public int getEnable_otp() {
    return mtmanapiJNI.UserRecord_enable_otp_get(swigCPtr, this);
  }

  public void setEnable_reserved(SWIGTYPE_p_int value) {
    mtmanapiJNI.UserRecord_enable_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getEnable_reserved() {
    long cPtr = mtmanapiJNI.UserRecord_enable_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setPassword_investor(String value) {
    mtmanapiJNI.UserRecord_password_investor_set(swigCPtr, this, value);
  }

  public String getPassword_investor() {
    return mtmanapiJNI.UserRecord_password_investor_get(swigCPtr, this);
  }

  public void setPassword_phone(String value) {
    mtmanapiJNI.UserRecord_password_phone_set(swigCPtr, this, value);
  }

  public String getPassword_phone() {
    return mtmanapiJNI.UserRecord_password_phone_get(swigCPtr, this);
  }

  public void setName(String value) {
    mtmanapiJNI.UserRecord_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return mtmanapiJNI.UserRecord_name_get(swigCPtr, this);
  }

  public void setCountry(String value) {
    mtmanapiJNI.UserRecord_country_set(swigCPtr, this, value);
  }

  public String getCountry() {
    return mtmanapiJNI.UserRecord_country_get(swigCPtr, this);
  }

  public void setCity(String value) {
    mtmanapiJNI.UserRecord_city_set(swigCPtr, this, value);
  }

  public String getCity() {
    return mtmanapiJNI.UserRecord_city_get(swigCPtr, this);
  }

  public void setState(String value) {
    mtmanapiJNI.UserRecord_state_set(swigCPtr, this, value);
  }

  public String getState() {
    return mtmanapiJNI.UserRecord_state_get(swigCPtr, this);
  }

  public void setZipcode(String value) {
    mtmanapiJNI.UserRecord_zipcode_set(swigCPtr, this, value);
  }

  public String getZipcode() {
    return mtmanapiJNI.UserRecord_zipcode_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    mtmanapiJNI.UserRecord_address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return mtmanapiJNI.UserRecord_address_get(swigCPtr, this);
  }

  public void setLead_source(String value) {
    mtmanapiJNI.UserRecord_lead_source_set(swigCPtr, this, value);
  }

  public String getLead_source() {
    return mtmanapiJNI.UserRecord_lead_source_get(swigCPtr, this);
  }

  public void setPhone(String value) {
    mtmanapiJNI.UserRecord_phone_set(swigCPtr, this, value);
  }

  public String getPhone() {
    return mtmanapiJNI.UserRecord_phone_get(swigCPtr, this);
  }

  public void setEmail(String value) {
    mtmanapiJNI.UserRecord_email_set(swigCPtr, this, value);
  }

  public String getEmail() {
    return mtmanapiJNI.UserRecord_email_get(swigCPtr, this);
  }

  public void setComment(String value) {
    mtmanapiJNI.UserRecord_comment_set(swigCPtr, this, value);
  }

  public String getComment() {
    return mtmanapiJNI.UserRecord_comment_get(swigCPtr, this);
  }

  public void setId(String value) {
    mtmanapiJNI.UserRecord_id_set(swigCPtr, this, value);
  }

  public String getId() {
    return mtmanapiJNI.UserRecord_id_get(swigCPtr, this);
  }

  public void setStatus(String value) {
    mtmanapiJNI.UserRecord_status_set(swigCPtr, this, value);
  }

  public String getStatus() {
    return mtmanapiJNI.UserRecord_status_get(swigCPtr, this);
  }

  public void setRegdate(int value) {
    mtmanapiJNI.UserRecord_regdate_set(swigCPtr, this, value);
  }

  public int getRegdate() {
    return mtmanapiJNI.UserRecord_regdate_get(swigCPtr, this);
  }

  public void setLastdate(int value) {
    mtmanapiJNI.UserRecord_lastdate_set(swigCPtr, this, value);
  }

  public int getLastdate() {
    return mtmanapiJNI.UserRecord_lastdate_get(swigCPtr, this);
  }

  public void setLeverage(int value) {
    mtmanapiJNI.UserRecord_leverage_set(swigCPtr, this, value);
  }

  public int getLeverage() {
    return mtmanapiJNI.UserRecord_leverage_get(swigCPtr, this);
  }

  public void setAgent_account(int value) {
    mtmanapiJNI.UserRecord_agent_account_set(swigCPtr, this, value);
  }

  public int getAgent_account() {
    return mtmanapiJNI.UserRecord_agent_account_get(swigCPtr, this);
  }

  public void setTimestamp(int value) {
    mtmanapiJNI.UserRecord_timestamp_set(swigCPtr, this, value);
  }

  public int getTimestamp() {
    return mtmanapiJNI.UserRecord_timestamp_get(swigCPtr, this);
  }

  public void setLast_ip(int value) {
    mtmanapiJNI.UserRecord_last_ip_set(swigCPtr, this, value);
  }

  public int getLast_ip() {
    return mtmanapiJNI.UserRecord_last_ip_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    mtmanapiJNI.UserRecord_balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return mtmanapiJNI.UserRecord_balance_get(swigCPtr, this);
  }

  public void setPrevmonthbalance(double value) {
    mtmanapiJNI.UserRecord_prevmonthbalance_set(swigCPtr, this, value);
  }

  public double getPrevmonthbalance() {
    return mtmanapiJNI.UserRecord_prevmonthbalance_get(swigCPtr, this);
  }

  public void setPrevbalance(double value) {
    mtmanapiJNI.UserRecord_prevbalance_set(swigCPtr, this, value);
  }

  public double getPrevbalance() {
    return mtmanapiJNI.UserRecord_prevbalance_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    mtmanapiJNI.UserRecord_credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return mtmanapiJNI.UserRecord_credit_get(swigCPtr, this);
  }

  public void setInterestrate(double value) {
    mtmanapiJNI.UserRecord_interestrate_set(swigCPtr, this, value);
  }

  public double getInterestrate() {
    return mtmanapiJNI.UserRecord_interestrate_get(swigCPtr, this);
  }

  public void setTaxes(double value) {
    mtmanapiJNI.UserRecord_taxes_set(swigCPtr, this, value);
  }

  public double getTaxes() {
    return mtmanapiJNI.UserRecord_taxes_get(swigCPtr, this);
  }

  public void setPrevmonthequity(double value) {
    mtmanapiJNI.UserRecord_prevmonthequity_set(swigCPtr, this, value);
  }

  public double getPrevmonthequity() {
    return mtmanapiJNI.UserRecord_prevmonthequity_get(swigCPtr, this);
  }

  public void setPrevequity(double value) {
    mtmanapiJNI.UserRecord_prevequity_set(swigCPtr, this, value);
  }

  public double getPrevequity() {
    return mtmanapiJNI.UserRecord_prevequity_get(swigCPtr, this);
  }

  public void setReserved2(SWIGTYPE_p_double value) {
    mtmanapiJNI.UserRecord_reserved2_set(swigCPtr, this, SWIGTYPE_p_double.getCPtr(value));
  }

  public SWIGTYPE_p_double getReserved2() {
    long cPtr = mtmanapiJNI.UserRecord_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public void setOtp_secret(String value) {
    mtmanapiJNI.UserRecord_otp_secret_set(swigCPtr, this, value);
  }

  public String getOtp_secret() {
    return mtmanapiJNI.UserRecord_otp_secret_get(swigCPtr, this);
  }

  public void setSecure_reserved(String value) {
    mtmanapiJNI.UserRecord_secure_reserved_set(swigCPtr, this, value);
  }

  public String getSecure_reserved() {
    return mtmanapiJNI.UserRecord_secure_reserved_get(swigCPtr, this);
  }

  public void setSend_reports(int value) {
    mtmanapiJNI.UserRecord_send_reports_set(swigCPtr, this, value);
  }

  public int getSend_reports() {
    return mtmanapiJNI.UserRecord_send_reports_get(swigCPtr, this);
  }

  public void setMqid(long value) {
    mtmanapiJNI.UserRecord_mqid_set(swigCPtr, this, value);
  }

  public long getMqid() {
    return mtmanapiJNI.UserRecord_mqid_get(swigCPtr, this);
  }

  public void setUser_color(SWIGTYPE_p_COLORREF value) {
    mtmanapiJNI.UserRecord_user_color_set(swigCPtr, this, SWIGTYPE_p_COLORREF.getCPtr(value));
  }

  public SWIGTYPE_p_COLORREF getUser_color() {
    return new SWIGTYPE_p_COLORREF(mtmanapiJNI.UserRecord_user_color_get(swigCPtr, this), true);
  }

  public void setUnused(String value) {
    mtmanapiJNI.UserRecord_unused_set(swigCPtr, this, value);
  }

  public String getUnused() {
    return mtmanapiJNI.UserRecord_unused_get(swigCPtr, this);
  }

  public void setApi_data(String value) {
    mtmanapiJNI.UserRecord_api_data_set(swigCPtr, this, value);
  }

  public String getApi_data() {
    return mtmanapiJNI.UserRecord_api_data_get(swigCPtr, this);
  }

  public UserRecord() {
    this(mtmanapiJNI.new_UserRecord(), true);
  }

}
