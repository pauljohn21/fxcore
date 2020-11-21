/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class ExposureValue {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ExposureValue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExposureValue obj) {
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
        mtmanapiJNI.delete_ExposureValue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCurrency(String value) {
    mtmanapiJNI.ExposureValue_currency_set(swigCPtr, this, value);
  }

  public String getCurrency() {
    return mtmanapiJNI.ExposureValue_currency_get(swigCPtr, this);
  }

  public void setClients(double value) {
    mtmanapiJNI.ExposureValue_clients_set(swigCPtr, this, value);
  }

  public double getClients() {
    return mtmanapiJNI.ExposureValue_clients_get(swigCPtr, this);
  }

  public void setCoverage(double value) {
    mtmanapiJNI.ExposureValue_coverage_set(swigCPtr, this, value);
  }

  public double getCoverage() {
    return mtmanapiJNI.ExposureValue_coverage_get(swigCPtr, this);
  }

  public ExposureValue() {
    this(mtmanapiJNI.new_ExposureValue(), true);
  }

}
