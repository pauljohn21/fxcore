/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class BackupInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BackupInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BackupInfo obj) {
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
        mtmanapiJNI.delete_BackupInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFile(String value) {
    mtmanapiJNI.BackupInfo_file_set(swigCPtr, this, value);
  }

  public String getFile() {
    return mtmanapiJNI.BackupInfo_file_get(swigCPtr, this);
  }

  public void setSize(int value) {
    mtmanapiJNI.BackupInfo_size_set(swigCPtr, this, value);
  }

  public int getSize() {
    return mtmanapiJNI.BackupInfo_size_get(swigCPtr, this);
  }

  public void setTime(int value) {
    mtmanapiJNI.BackupInfo_time_set(swigCPtr, this, value);
  }

  public int getTime() {
    return mtmanapiJNI.BackupInfo_time_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_int value) {
    mtmanapiJNI.BackupInfo_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getReserved() {
    long cPtr = mtmanapiJNI.BackupInfo_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public BackupInfo() {
    this(mtmanapiJNI.new_BackupInfo(), true);
  }

}
