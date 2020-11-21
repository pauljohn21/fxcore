/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class ConTime {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ConTime(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConTime obj) {
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
        mtmanapiJNI.delete_ConTime(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDays(SWIGTYPE_p_a_24__int value) {
    mtmanapiJNI.ConTime_days_set(swigCPtr, this, SWIGTYPE_p_a_24__int.getCPtr(value));
  }

  public SWIGTYPE_p_a_24__int getDays() {
    long cPtr = mtmanapiJNI.ConTime_days_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_24__int(cPtr, false);
  }

  public void setDayscontrol(int value) {
    mtmanapiJNI.ConTime_dayscontrol_set(swigCPtr, this, value);
  }

  public int getDayscontrol() {
    return mtmanapiJNI.ConTime_dayscontrol_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_int value) {
    mtmanapiJNI.ConTime_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getReserved() {
    long cPtr = mtmanapiJNI.ConTime_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public ConTime() {
    this(mtmanapiJNI.new_ConTime(), true);
  }

}
