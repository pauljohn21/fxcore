/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class ConSync {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ConSync(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConSync obj) {
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
        mtmanapiJNI.delete_ConSync(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setServer(String value) {
    mtmanapiJNI.ConSync_server_set(swigCPtr, this, value);
  }

  public String getServer() {
    return mtmanapiJNI.ConSync_server_get(swigCPtr, this);
  }

  public void setUnusedport(int value) {
    mtmanapiJNI.ConSync_unusedport_set(swigCPtr, this, value);
  }

  public int getUnusedport() {
    return mtmanapiJNI.ConSync_unusedport_get(swigCPtr, this);
  }

  public void setLogin(String value) {
    mtmanapiJNI.ConSync_login_set(swigCPtr, this, value);
  }

  public String getLogin() {
    return mtmanapiJNI.ConSync_login_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    mtmanapiJNI.ConSync_password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return mtmanapiJNI.ConSync_password_get(swigCPtr, this);
  }

  public void setEnable(int value) {
    mtmanapiJNI.ConSync_enable_set(swigCPtr, this, value);
  }

  public int getEnable() {
    return mtmanapiJNI.ConSync_enable_get(swigCPtr, this);
  }

  public void setMode(int value) {
    mtmanapiJNI.ConSync_mode_set(swigCPtr, this, value);
  }

  public int getMode() {
    return mtmanapiJNI.ConSync_mode_get(swigCPtr, this);
  }

  public void setFrom(int value) {
    mtmanapiJNI.ConSync_from_set(swigCPtr, this, value);
  }

  public int getFrom() {
    return mtmanapiJNI.ConSync_from_get(swigCPtr, this);
  }

  public void setTo(int value) {
    mtmanapiJNI.ConSync_to_set(swigCPtr, this, value);
  }

  public int getTo() {
    return mtmanapiJNI.ConSync_to_get(swigCPtr, this);
  }

  public void setSecurities(String value) {
    mtmanapiJNI.ConSync_securities_set(swigCPtr, this, value);
  }

  public String getSecurities() {
    return mtmanapiJNI.ConSync_securities_get(swigCPtr, this);
  }

  public void setTimecorrection(int value) {
    mtmanapiJNI.ConSync_timecorrection_set(swigCPtr, this, value);
  }

  public int getTimecorrection() {
    return mtmanapiJNI.ConSync_timecorrection_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_int value) {
    mtmanapiJNI.ConSync_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getReserved() {
    long cPtr = mtmanapiJNI.ConSync_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setNext(ConSync value) {
    mtmanapiJNI.ConSync_next_set(swigCPtr, this, ConSync.getCPtr(value), value);
  }

  public ConSync getNext() {
    long cPtr = mtmanapiJNI.ConSync_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ConSync(cPtr, false);
  }

  public ConSync() {
    this(mtmanapiJNI.new_ConSync(), true);
  }

}
