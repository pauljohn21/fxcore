/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class RateInfoOld {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RateInfoOld(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RateInfoOld obj) {
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
        mtmanapiJNI.delete_RateInfoOld(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCtm(int value) {
    mtmanapiJNI.RateInfoOld_ctm_set(swigCPtr, this, value);
  }

  public int getCtm() {
    return mtmanapiJNI.RateInfoOld_ctm_get(swigCPtr, this);
  }

  public void setOpen(int value) {
    mtmanapiJNI.RateInfoOld_open_set(swigCPtr, this, value);
  }

  public int getOpen() {
    return mtmanapiJNI.RateInfoOld_open_get(swigCPtr, this);
  }

  public void setHigh(short value) {
    mtmanapiJNI.RateInfoOld_high_set(swigCPtr, this, value);
  }

  public short getHigh() {
    return mtmanapiJNI.RateInfoOld_high_get(swigCPtr, this);
  }

  public void setLow(short value) {
    mtmanapiJNI.RateInfoOld_low_set(swigCPtr, this, value);
  }

  public short getLow() {
    return mtmanapiJNI.RateInfoOld_low_get(swigCPtr, this);
  }

  public void setClose(short value) {
    mtmanapiJNI.RateInfoOld_close_set(swigCPtr, this, value);
  }

  public short getClose() {
    return mtmanapiJNI.RateInfoOld_close_get(swigCPtr, this);
  }

  public void setVol(double value) {
    mtmanapiJNI.RateInfoOld_vol_set(swigCPtr, this, value);
  }

  public double getVol() {
    return mtmanapiJNI.RateInfoOld_vol_get(swigCPtr, this);
  }

  public RateInfoOld() {
    this(mtmanapiJNI.new_RateInfoOld(), true);
  }

}