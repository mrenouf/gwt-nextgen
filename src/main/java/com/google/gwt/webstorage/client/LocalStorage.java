package com.google.gwt.webstorage.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class LocalStorage  {
  public static final WebStorage local = getLocal();

  // TODO use GWT.create with deferred binding for a fallback mechanism
  private static native WebStorage getLocal() /*-{
    return $wnd.localStorage;
  }-*/;
  
  public static int getLength() {
    return local.getLength();
  }

  public static void clear() {
    local.clear();
  }
  
  public static String getKey(int index) {
    return local.getKey(index);
  }

  public static void removeItem(String key) {
    local.removeItem(key);
  }

  public static String getString(String key) {
    return local.getString(key);
  }

  public static Integer getInteger(String key) {
    return local.getInteger(key);
  }

  public static Double getNumber(String key) {
    return local.getNumber(key);
  }

  public static <T extends JavaScriptObject> JsArray<T> getArray(String key) {
    return local.getItem(key);
  }

  public static <T extends JavaScriptObject> T getItem(String key) {
    return local.getItem(key);
  }

  public static <T extends JavaScriptObject> void setItem(String key, T value) throws QuotaExceededError, ObjectNotSupportedError {
    local.setItem(key, value);
  }

  public static void setItem(String key, String value) throws QuotaExceededError, ObjectNotSupportedError {
    local.setItem(key, value);
  }

  public static void setItem(String key, int value) throws QuotaExceededError, ObjectNotSupportedError {
    local.setItem(key, value);
  }

  public static void setItem(String key, double value) throws QuotaExceededError, ObjectNotSupportedError {
    local.setItem(key, value);
  }

  public static <T extends JavaScriptObject> void setItem(String key, JsArray<T> value) throws QuotaExceededError, ObjectNotSupportedError {
    local.setItem(key, value);
  }

}
