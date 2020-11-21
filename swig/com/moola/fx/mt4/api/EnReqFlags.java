/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public final class EnReqFlags {
  public final static EnReqFlags TT_FLAG_NONE = new EnReqFlags("TT_FLAG_NONE", mtmanapiJNI.TT_FLAG_NONE_get());
  public final static EnReqFlags TT_FLAG_SIGNAL = new EnReqFlags("TT_FLAG_SIGNAL", mtmanapiJNI.TT_FLAG_SIGNAL_get());
  public final static EnReqFlags TT_FLAG_EXPERT = new EnReqFlags("TT_FLAG_EXPERT", mtmanapiJNI.TT_FLAG_EXPERT_get());
  public final static EnReqFlags TT_FLAG_GATEWAY = new EnReqFlags("TT_FLAG_GATEWAY", mtmanapiJNI.TT_FLAG_GATEWAY_get());
  public final static EnReqFlags TT_FLAG_MOBILE = new EnReqFlags("TT_FLAG_MOBILE", mtmanapiJNI.TT_FLAG_MOBILE_get());
  public final static EnReqFlags TT_FLAG_WEB = new EnReqFlags("TT_FLAG_WEB", mtmanapiJNI.TT_FLAG_WEB_get());
  public final static EnReqFlags TT_FLAG_API = new EnReqFlags("TT_FLAG_API", mtmanapiJNI.TT_FLAG_API_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static EnReqFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + EnReqFlags.class + " with value " + swigValue);
  }

  private EnReqFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EnReqFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EnReqFlags(String swigName, EnReqFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static EnReqFlags[] swigValues = { TT_FLAG_NONE, TT_FLAG_SIGNAL, TT_FLAG_EXPERT, TT_FLAG_GATEWAY, TT_FLAG_MOBILE, TT_FLAG_WEB, TT_FLAG_API };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

