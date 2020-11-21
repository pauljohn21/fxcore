/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class GroupCommandInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GroupCommandInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GroupCommandInfo obj) {
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
        mtmanapiJNI.delete_GroupCommandInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLen(int value) {
    mtmanapiJNI.GroupCommandInfo_len_set(swigCPtr, this, value);
  }

  public int getLen() {
    return mtmanapiJNI.GroupCommandInfo_len_get(swigCPtr, this);
  }

  public void setCommand(char value) {
    mtmanapiJNI.GroupCommandInfo_command_set(swigCPtr, this, value);
  }

  public char getCommand() {
    return mtmanapiJNI.GroupCommandInfo_command_get(swigCPtr, this);
  }

  public void setNewgroup(String value) {
    mtmanapiJNI.GroupCommandInfo_newgroup_set(swigCPtr, this, value);
  }

  public String getNewgroup() {
    return mtmanapiJNI.GroupCommandInfo_newgroup_get(swigCPtr, this);
  }

  public void setLeverage(int value) {
    mtmanapiJNI.GroupCommandInfo_leverage_set(swigCPtr, this, value);
  }

  public int getLeverage() {
    return mtmanapiJNI.GroupCommandInfo_leverage_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_int value) {
    mtmanapiJNI.GroupCommandInfo_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getReserved() {
    long cPtr = mtmanapiJNI.GroupCommandInfo_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public GroupCommandInfo() {
    this(mtmanapiJNI.new_GroupCommandInfo(), true);
  }

}
