/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class ConSymbolGroup {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ConSymbolGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConSymbolGroup obj) {
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
        mtmanapiJNI.delete_ConSymbolGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    mtmanapiJNI.ConSymbolGroup_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return mtmanapiJNI.ConSymbolGroup_name_get(swigCPtr, this);
  }

  public void setDescription(String value) {
    mtmanapiJNI.ConSymbolGroup_description_set(swigCPtr, this, value);
  }

  public String getDescription() {
    return mtmanapiJNI.ConSymbolGroup_description_get(swigCPtr, this);
  }

  public ConSymbolGroup() {
    this(mtmanapiJNI.new_ConSymbolGroup(), true);
  }

}
