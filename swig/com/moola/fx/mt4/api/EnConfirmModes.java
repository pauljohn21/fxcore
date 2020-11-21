/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public final class EnConfirmModes {
  public final static EnConfirmModes CONFIRM_MODE_ADD_PRICES = new EnConfirmModes("CONFIRM_MODE_ADD_PRICES", mtmanapiJNI.CONFIRM_MODE_ADD_PRICES_get());
  public final static EnConfirmModes CONFIRM_MODE_PACKET = new EnConfirmModes("CONFIRM_MODE_PACKET", mtmanapiJNI.CONFIRM_MODE_PACKET_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static EnConfirmModes swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + EnConfirmModes.class + " with value " + swigValue);
  }

  private EnConfirmModes(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EnConfirmModes(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EnConfirmModes(String swigName, EnConfirmModes swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static EnConfirmModes[] swigValues = { CONFIRM_MODE_ADD_PRICES, CONFIRM_MODE_PACKET };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

