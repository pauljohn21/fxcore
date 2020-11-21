/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class PluginCfg {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PluginCfg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PluginCfg obj) {
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
        mtmanapiJNI.delete_PluginCfg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    mtmanapiJNI.PluginCfg_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return mtmanapiJNI.PluginCfg_name_get(swigCPtr, this);
  }

  public void setValue(String value) {
    mtmanapiJNI.PluginCfg_value_set(swigCPtr, this, value);
  }

  public String getValue() {
    return mtmanapiJNI.PluginCfg_value_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_int value) {
    mtmanapiJNI.PluginCfg_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getReserved() {
    long cPtr = mtmanapiJNI.PluginCfg_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public PluginCfg() {
    this(mtmanapiJNI.new_PluginCfg(), true);
  }

}
