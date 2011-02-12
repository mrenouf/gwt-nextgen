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
package com.google.gwt.nextgen.geolocation.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Encapsulates some optional arguments to make a new Geolocation service call.
 */
public final class PositionOptions extends JavaScriptObject {
  protected PositionOptions() {}

  public static PositionOptions create() {
    PositionOptions opts = JavaScriptObject.createObject().cast();
    // Defaults values if PositionOptions omitted
    return opts
      .withTimeout(Integer.MAX_VALUE)
      .withMaximumAge(0)
      .withHighAccuracy(false);
  }

  /**
   * Gets whether high accuracy is requested.
   * 
   * @return true if high accuracy is requested.
   */
  public native boolean isHighAccuracy() /*-{
    return this.enableHighAccuracy;
  }-*/;

  /**
   * Returns the current value for the request timeout.
   * 
   * @return the timeout value of this options instance
   */
  public native int getTimeout() /*-{
    return this.timeout;
  }-*/;
  
  /**
   * Returns the current value for the maximumAge setting.
   * 
   * @return the current value for the maximumAge setting.
   */
  public native int getMaximumAge() /*-{
    return this.maximumAge;
  }-*/;
  
  /**
   * Requests the most accurate possible results. This may result in
   * slower response times or increased battery consumption. Also, there is no
   * guarantee that the device will be able to provide more accurate results
   * than if this flag is not specified. The default value is false.
   * 
   * @param enabled Whether higher accuracy positioning should be  requested
   * @return this instance
   */
  public native PositionOptions withHighAccuracy(boolean enabled) /*-{
    this.enableHighAccuracy = enabled;
    return this;
  }-*/;

  /**
   * Requests the most accurate possible results. This may result in
   * slower response times or increased battery consumption. Also, there is no
   * guarantee that the device will be able to provide more accurate results
   * than if this flag is not specified. The default value is false.
   * 
   * @return this instance
   */
  public native PositionOptions withHighAccuracy() /*-{
    this.enableHighAccuracy = true;
    return this;
  }-*/;
  
  /**
   * The maximum length of time (expressed in milliseconds) that is allowed to
   * pass from the call to getCurrentPosition() or watchPosition() until the
   * corresponding successCallback is invoked.
   * <p>
   * If the implementation is unable to successfully acquire a new Position
   * before the given timeout elapses, and no other errors have occurred in this
   * interval, then the corresponding errorCallback must be invoked with a
   * PositionError object whose code attribute is set to TIMEOUT. Note that the
   * time that is spent obtaining the user permission is not included in the
   * period covered by the timeout attribute. The timeout attribute only applies
   * to the location acquisition operation.
   * 
   * @param timeout the timeout value in milliseconds
   * @return this instance
   */
  public native PositionOptions withTimeout(int timeout) /*-{
    this.timeout = timeout;
    return this;
  }-*/;
  
  /**
   * Sets the maximum age (in milliseconds) of a cached position the application
   * is willing to accept.
   * <p>
   * If maximumAge is set to 0, the implementation must immediately attempt to
   * acquire a new position object.
   * <p>
   * Setting the maximumAge to Infinity must determine the implementation to
   * return a cached position regardless of its age.
   * <p>
   * If an implementation does not have a cached position available whose age is
   * no greater than the specified maximumAge, then it must acquire a new
   * position object. In case of a watchPosition(), the maximumAge refers to the
   * first position object returned by the implementation.
   * <p>
   * The default value is 0.
   * 
   * @param maxAge The onldest cached position to allow as a response
   * @return this instance
   */
  public native PositionOptions withMaximumAge(int maxAge) /*-{
    this.maximumAge = maxAge;
    return this;
  }-*/;
  
  /**
   * Requests a the system return any cached position if available. Only if no
   * position is known, a position will be acquired and returned.
   * 
   * @return this instance
   */
  public native PositionOptions withNoMaximumAge() /*-{
    this.maximumAge = Infinity;
    return this;
  }-*/;
  
  /**
   * Converts a Java array of strings to a JavaScript array of strings.
   */
  public static JsArrayString toJavaScriptArray(String[] elements) {
    JsArrayString array = JavaScriptObject.createArray().cast();
    for (int i = 0, l = elements.length; i < l; ++i) {
      array.set(i, elements[i]);
    }
    return array;
  }
  
  /**
   * Converts a JavaScript array of strings to a Java array of strings.
   */
  public static String[] toJavaArray(JsArrayString jsArray) {
    String[] urls = new String[jsArray.length()];
    for (int i = 0, l = jsArray.length(); i < l; i++) {
        urls[i] = jsArray.get(i);
    }
    return urls;
  }
}
