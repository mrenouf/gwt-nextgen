/*
 * Copyright 2009 Mark Renouf
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHDIR
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.nextgen.webstorage.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public final class WebStorage extends JavaScriptObject {
  protected WebStorage() {}

  private static native WebStorage getSessionStorage() /*-{
    return $wnd.sessionStorage;
  }-*/;

  private static native WebStorage getLocalStorage() /*-{
    return $wnd.localStorage;
  }-*/;

  public native int getLength() /*-{
    return this.length;
  }-*/;

  public native void clear() /*-{
    this.clear();
  }-*/;

  public native String getKey(int index) /*-{
    return this.getKey(index);
  }-*/;

  public native void removeItem(String key) /*-{
    this.removeItem(key);
  }-*/;

  public native <T extends JavaScriptObject> T getItem(String key) /*-{
    return this.getItem(key);
  }-*/;

  public native String getString(String key) /*-{
    return this.getItem(key);
  }-*/;

  public native Integer getInteger(String key) /*-{
    return this.getItem(key);
  }-*/;

  public native Double getNumber(String key) /*-{
    return this.getItem(key);
  }-*/;

  public native <T extends JavaScriptObject> void setItem(String key, T value) throws QuotaExceededError, ObjectNotSupportedError /*-{
    this.setItem(key, value);
  }-*/;

  public native void setItem(String key, String value) throws QuotaExceededError, ObjectNotSupportedError /*-{
    this.setItem(key, value);
  }-*/;

  public native void setItem(String key, int value) throws QuotaExceededError, ObjectNotSupportedError /*-{
    this.setItem(key, value);
  }-*/;

  public native void setItem(String key, double value) throws QuotaExceededError, ObjectNotSupportedError /*-{
    this.setItem(key, value);
  }-*/;

  public native <T extends JavaScriptObject> void setItem(String key, JsArray<T> value) throws QuotaExceededError, ObjectNotSupportedError /*-{
    this.setItem(key, value);
  }-*/;

}
