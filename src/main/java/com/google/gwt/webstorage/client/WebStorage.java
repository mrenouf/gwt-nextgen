package com.google.gwt.webstorage.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

final class WebStorage extends JavaScriptObject {
  protected WebStorage() {}

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
