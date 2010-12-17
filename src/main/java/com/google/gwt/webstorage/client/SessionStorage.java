package com.google.gwt.webstorage.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class SessionStorage  {
  public static final WebStorage session = getSession();

  // TODO use GWT.create with deferred binding for a fallback mechanism
  private static native WebStorage getSession() /*-{
    return $wnd.sessionStorage;
  }-*/;
  
  public static int getLength() {
    return session.getLength();
  }

  public static void clear() {
    session.clear();
  }
  
  public static String getKey(int index) {
    return session.getKey(index);
  }

  public static void removeItem(String key) {
    session.removeItem(key);
  }

  public static String getString(String key) {
    return session.getString(key);
  }

  public static Integer getInteger(String key) {
    return session.getInteger(key);
  }

  public static Double getNumber(String key) {
    return session.getNumber(key);
  }

  public static <T extends JavaScriptObject> JsArray<T> getArray(String key) {
    return session.getItem(key);
  }

  public static <T extends JavaScriptObject> T getItem(String key) {
    return session.getItem(key);
  }
  
  public static <T extends JavaScriptObject> void setItem(String key, T value) throws QuotaExceededError, ObjectNotSupportedError {
    session.setItem(key, value);
  }

  public static void setItem(String key, String value) throws QuotaExceededError, ObjectNotSupportedError {
    session.setItem(key, value);
  }

  public static void setItem(String key, int value) throws QuotaExceededError, ObjectNotSupportedError {
    session.setItem(key, value);
  }

  public static void setItem(String key, double value) throws QuotaExceededError, ObjectNotSupportedError {
    session.setItem(key, value);
  }

  public static <T extends JavaScriptObject> void setItem(String key, JsArray<T> value) throws QuotaExceededError, ObjectNotSupportedError {
    session.setItem(key, value);
  }

}
