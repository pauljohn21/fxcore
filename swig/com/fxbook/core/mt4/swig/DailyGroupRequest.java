/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class DailyGroupRequest {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DailyGroupRequest(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DailyGroupRequest obj) {
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
        mtmanapiJNI.delete_DailyGroupRequest(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    mtmanapiJNI.DailyGroupRequest_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return mtmanapiJNI.DailyGroupRequest_name_get(swigCPtr, this);
  }

  public void setFrom(int value) {
    mtmanapiJNI.DailyGroupRequest_from_set(swigCPtr, this, value);
  }

  public int getFrom() {
    return mtmanapiJNI.DailyGroupRequest_from_get(swigCPtr, this);
  }

  public void setTo(int value) {
    mtmanapiJNI.DailyGroupRequest_to_set(swigCPtr, this, value);
  }

  public int getTo() {
    return mtmanapiJNI.DailyGroupRequest_to_get(swigCPtr, this);
  }

  public void setTotal(int value) {
    mtmanapiJNI.DailyGroupRequest_total_set(swigCPtr, this, value);
  }

  public int getTotal() {
    return mtmanapiJNI.DailyGroupRequest_total_get(swigCPtr, this);
  }

  public void setReserved(int value) {
    mtmanapiJNI.DailyGroupRequest_reserved_set(swigCPtr, this, value);
  }

  public int getReserved() {
    return mtmanapiJNI.DailyGroupRequest_reserved_get(swigCPtr, this);
  }

  public DailyGroupRequest() {
    this(mtmanapiJNI.new_DailyGroupRequest(), true);
  }

}
