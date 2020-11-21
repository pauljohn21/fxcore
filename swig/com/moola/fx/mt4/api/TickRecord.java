/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class TickRecord {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TickRecord(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TickRecord obj) {
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
        mtmanapiJNI.delete_TickRecord(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCtm(int value) {
    mtmanapiJNI.TickRecord_ctm_set(swigCPtr, this, value);
  }

  public int getCtm() {
    return mtmanapiJNI.TickRecord_ctm_get(swigCPtr, this);
  }

  public void setBid(double value) {
    mtmanapiJNI.TickRecord_bid_set(swigCPtr, this, value);
  }

  public double getBid() {
    return mtmanapiJNI.TickRecord_bid_get(swigCPtr, this);
  }

  public void setAsk(double value) {
    mtmanapiJNI.TickRecord_ask_set(swigCPtr, this, value);
  }

  public double getAsk() {
    return mtmanapiJNI.TickRecord_ask_get(swigCPtr, this);
  }

  public void setDatafeed(int value) {
    mtmanapiJNI.TickRecord_datafeed_set(swigCPtr, this, value);
  }

  public int getDatafeed() {
    return mtmanapiJNI.TickRecord_datafeed_get(swigCPtr, this);
  }

  public void setFlags(char value) {
    mtmanapiJNI.TickRecord_flags_set(swigCPtr, this, value);
  }

  public char getFlags() {
    return mtmanapiJNI.TickRecord_flags_get(swigCPtr, this);
  }

  public TickRecord() {
    this(mtmanapiJNI.new_TickRecord(), true);
  }

}
