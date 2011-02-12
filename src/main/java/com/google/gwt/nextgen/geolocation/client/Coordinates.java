/*
 * Copyright 2008 Google Inc. Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.google.gwt.nextgen.geolocation.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a position returned from the Geolocation
 * service.
 */
public final class Coordinates extends JavaScriptObject {
  protected Coordinates() {}

  /**
   * Gets the latitude in degrees (WGS84).
   * 
   * @return the latitude in degrees (WGS84).
   */
  public native double getLatitude() /*-{
    return this.latitude;
  }-*/;

  /**
   * Gets the longitude in degrees (WGS84).
   * 
   * @return the longitude in degrees (WGS84).
   */
  public native double getLongitude() /*-{
    return this.longitude;
  }-*/;

  /**
   * Gets the height in meters (WGS84 datum), or 0 if not available.
   * 
   * @return the height in meters (WGS84 datum), or 0 if not available.
   */
  public native double getAltitude() /*-{
    return (!!this.altitude) ? this.altitude : 0;
  }-*/;

  /**
   * Returns the accuracy level of the latitude and longitude coordinates. It is
   * specified in meters and must be supported by all implementations. The value
   * of the accuracy attribute must be a non-negative real number.
   * 
   * @return the accuracy of the position in meters
   */
  public native double getAccuracy() /*-{
    return (!!this.accuracy) ? this.accuracy : NaN;
  }-*/;

  /**
   * Returns the accuracy level of the returned altitude value.
   * 
   * @return the accuracy level of the returned altitude value or 0 if altitude
   *         is unavailable.
   */
  public native double getAltitudeAccuracy() /*-{
    return (!!this.altitudeAccuracy) ? this.altitudeAccuracy : 0;
  }-*/;

  /**
   * Returns the direction of travel of the hosting device, in degrees, where 0°
   * ≤ heading < 360°, counting clockwise relative to the true north.
   * <p>
   * If the implementation cannot provide heading information, or the hosting
   * device is stationary (i.e. the value of the speed attribute is 0), then the
   * value of the heading attribute must be NaN.
   * <p>
   * Reminder, you must use {@linkplain Double#isNaN(double)} to test for NaN.
   * 
   * @return the current heading in degrees, or NaN if stationary.
   */
  public native double getHeading() /*-{
    return (!!this.heading) ? this.heading : NaN;
  }-*/;

  /**
   * Returns the current ground speed of the hosting device, in meters per
   * second. If the implementation cannot provide speed information, the value
   * of this attribute will be NaN. Otherwise, the value of the speed attribute
   * must be a non-negative real number.
   * <p>
   * Reminder, you must use {@linkplain Double#isNaN(double)} to test for NaN.
   * 
   * @return the vertical accuracy of the position in meters, or null if not
   *         available.
   */
  public native double getSpeed() /*-{
    return (!!this.speed) ? this.speed : NaN;
  }-*/;

}
