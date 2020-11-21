/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class ReportGroupRequest {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ReportGroupRequest(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ReportGroupRequest obj) {
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
        mtmanapiJNI.delete_ReportGroupRequest(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    mtmanapiJNI.ReportGroupRequest_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return mtmanapiJNI.ReportGroupRequest_name_get(swigCPtr, this);
  }

  public void setFrom(int value) {
    mtmanapiJNI.ReportGroupRequest_from_set(swigCPtr, this, value);
  }

  public int getFrom() {
    return mtmanapiJNI.ReportGroupRequest_from_get(swigCPtr, this);
  }

  public void setTo(int value) {
    mtmanapiJNI.ReportGroupRequest_to_set(swigCPtr, this, value);
  }

  public int getTo() {
    return mtmanapiJNI.ReportGroupRequest_to_get(swigCPtr, this);
  }

  public void setTotal(int value) {
    mtmanapiJNI.ReportGroupRequest_total_set(swigCPtr, this, value);
  }

  public int getTotal() {
    return mtmanapiJNI.ReportGroupRequest_total_get(swigCPtr, this);
  }

  public ReportGroupRequest() {
    this(mtmanapiJNI.new_ReportGroupRequest(), true);
  }

}
