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

import java.util.Date;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a position returned from the Geolocation service.
 */
public final class Position extends JavaScriptObject {
  protected Position() {}

  /**
   * Returns the set of geographic coordinates together with their associated
   * accuracy, as well as a set of other optional attributes such as altitude
   * and speed.
   * 
   * @return the coordinates value
   */
  public native Coordinates getCoordinates() /*-{
    return this.coords;
  }-*/;
  
  /**
   * Gets the time when this Position was acquired.
   * 
   * @return the time when this Position was acquired.
   */
  public Date getTimestamp() {
    return new Date((long) getTimestamp0());
  }

  private native double getTimestamp0() /*-{
    return this.timestamp.getTime();
  }-*/;

}
