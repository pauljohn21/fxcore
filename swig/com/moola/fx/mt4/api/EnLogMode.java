/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public final class EnLogMode {
  public final static EnLogMode LOG_MODE_ENABLED = new EnLogMode("LOG_MODE_ENABLED");
  public final static EnLogMode LOG_MODE_DISABLED = new EnLogMode("LOG_MODE_DISABLED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static EnLogMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + EnLogMode.class + " with value " + swigValue);
  }

  private EnLogMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EnLogMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EnLogMode(String swigName, EnLogMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static EnLogMode[] swigValues = { LOG_MODE_ENABLED, LOG_MODE_DISABLED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
