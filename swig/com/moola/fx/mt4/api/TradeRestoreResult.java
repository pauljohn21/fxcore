/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class TradeRestoreResult {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TradeRestoreResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TradeRestoreResult obj) {
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
        mtmanapiJNI.delete_TradeRestoreResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOrder(int value) {
    mtmanapiJNI.TradeRestoreResult_order_set(swigCPtr, this, value);
  }

  public int getOrder() {
    return mtmanapiJNI.TradeRestoreResult_order_get(swigCPtr, this);
  }

  public void setRes(short value) {
    mtmanapiJNI.TradeRestoreResult_res_set(swigCPtr, this, value);
  }

  public short getRes() {
    return mtmanapiJNI.TradeRestoreResult_res_get(swigCPtr, this);
  }

  public TradeRestoreResult() {
    this(mtmanapiJNI.new_TradeRestoreResult(), true);
  }

}
