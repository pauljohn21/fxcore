/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class CManagerFactory {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CManagerFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CManagerFactory obj) {
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
        mtmanapiJNI.delete_CManagerFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CManagerFactory(String lib_path) {
    this(mtmanapiJNI.new_CManagerFactory__SWIG_0(lib_path), true);
  }

  public CManagerFactory() {
    this(mtmanapiJNI.new_CManagerFactory__SWIG_1(), true);
  }

  public void Init(String lib_path) {
    mtmanapiJNI.CManagerFactory_Init__SWIG_0(swigCPtr, this, lib_path);
  }

  public void Init() {
    mtmanapiJNI.CManagerFactory_Init__SWIG_1(swigCPtr, this);
  }

  public int WinsockStartup() {
    return mtmanapiJNI.CManagerFactory_WinsockStartup(swigCPtr, this);
  }

  public void WinsockCleanup() {
    mtmanapiJNI.CManagerFactory_WinsockCleanup(swigCPtr, this);
  }

  public int IsValid() {
    return mtmanapiJNI.CManagerFactory_IsValid(swigCPtr, this);
  }

  public int Version() {
    return mtmanapiJNI.CManagerFactory_Version(swigCPtr, this);
  }

  public CManagerInterface Create(int version) {
    long cPtr = mtmanapiJNI.CManagerFactory_Create(swigCPtr, this, version);
    return (cPtr == 0) ? null : new CManagerInterface(cPtr, false);
  }

}
