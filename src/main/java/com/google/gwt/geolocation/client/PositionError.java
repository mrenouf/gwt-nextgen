/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.geolocation.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Arguments returned when a Geolocation fails. 
 */
public final class PositionError extends JavaScriptObject {
  protected PositionError() {}

  public static PositionError create(Code code) {
    PositionError error = JavaScriptObject.createObject().cast();
    return error.withCode(code);
  }

  public static PositionError create(Code code, String message) {
    PositionError error = JavaScriptObject.createObject().cast();
    return error.withCode(code).withMessage(message);
  }
  
  /**
   * The location acquisition process failed because the application origin does
   * not have permission to use the Geolocation API.
   */
  public static final int PERMISSION_DENIED = 1;
 
  /**
   * The position of the device could not be determined. For instance, one or
   * more of the location providers used in the location acquisition process
   * reported an internal error that caused the process to fail entirely.
   */
  public static final int POSITION_UNAVAILABLE = 2;
 
  /**
   * The length of time specified by the timeout property has elapsed before the
   * implementation could successfully acquire a new Position object.
   */
  public static final int TIMEOUT = 3;

  public static enum Code {
    UNKNOWN(-1),
    PERMISSION_DENIED(1),
    POSITION_UNAVAILABLE(2),
    TIMEOUT(3);
    
    private final int value;
    
    private Code(int value) {
      this.value = value;
    }
    
    public int intValue() {
      return value;
    }
    
    public static Code fromValue(int value) {
      for (Code code : Code.values()) {
        if (code.intValue() == value) {
          return code;
        }
      }
      return UNKNOWN;
    }
  }
  
  private native int nativeGetCode()/*-{
    return this.code;
  }-*/;

  private native void nativeSetCode(int value) /*-{
  this.code = value;
}-*/;

  /**
   * Gets the code for this type of error.
   * 
   * @return the code for this type of error.
   */
  public Code getCode() {
    return Code.fromValue(nativeGetCode());
  }
  
  protected PositionError withCode(Code code) {
    nativeSetCode(code.intValue());
    return this;
  }
  
  /**
   * Returns a human readable message, suitable for logs.
   * 
   * @return a human readable message, suitable for logs.
   */
  public native String getMessage()/*-{
    return this.message;
  }-*/;
  
  protected native PositionError withMessage(String message) /*-{
    this.message = message;
    return this;
  }-*/;
}
