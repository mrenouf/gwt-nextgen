package com.google.gwt.nextgen.shared.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class FastStringSet extends JavaScriptObject {

  public JsArrayString keys() {
    return keyStandard();
  }

  public native JsArrayString keyStandard() /*-{
    var keys = [];
    for (key in this) {
      if (typeof key == 'string' && this.hasOwnProperty(key)) {
        keys.push(key);
      }
    }
    return keys;
  }-*/;

  /** @since JavaScript 1.8.5 */
  public native JsArrayString keysFast() /*-{
    return this.keys();
  }-*/;

  public native int size() /*-{
    var size = 0;
    for (key in this) {
      if (this.hasOwnProperty(key)) {
        size++;
      }
    }
    return size;
  }-*/;

  public int sizeFast() {
   return this.keysFast().length();
  }

  public native boolean isEmpty() /*-{
    for (key in this) {
      if (this.hasOwnProperty(key)) {
        return false;
      }
    }
    return true;
  }-*/;

  public boolean isEmptyFast() {
    return this.keysFast().length() == 0;
  };

  public native boolean contains(String key) /*-{
    return this.hasOwnProperty(key);
  }-*/;

  public native boolean add(String e) /*-{
    var existing = e.hasOwnProperty(e);
    this[e] = true;
    return !existing;
  }-*/;

  public native boolean remove(Object key) /*-{
    if (typeof key != "string") return false;
    var existing = e.hasOwnProperty(key);
    if (existing) delete this[key];
    return existing;
  }-*/;

  public native void clear() /*-{
    for (key in this) {
      if (this.hasOwnProperty(key)) {
        delete this[key];
      }
    }
  }-*/;

  public native boolean containsAll(FastStringSet s) /*-{
    for (key in s) {
      if (s.hasOwnProperty(key) && !this.hasOwnProperty(key)) {
        return false;
      }
    }
    return true;
  }-*/;

  public native boolean containsAllFast(FastStringSet s) /*-{
    var k = s.keys();
    var l = k.lenth;
    for (var i=0; i<l; i++) {
      if (!this.hasOwnProperty(k[i])) {
        return false;
      }
    }
    return true;
  }-*/;

  public boolean addAll(FastStringSet s) {
    return false;
  }

  public boolean retainAll(FastStringSet s) {
    return false;
  }

  public boolean removeAll(FastStringSet s) {
    return false;
  }


}
