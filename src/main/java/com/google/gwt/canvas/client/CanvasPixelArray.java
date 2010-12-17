package com.google.gwt.canvas.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class CanvasPixelArray extends JavaScriptObject {

  protected CanvasPixelArray() {
  }

  public native double getLength() /*-{
    return this.length;
  }-*/;
  
  public native int get(double index) /*-{
    return this[index];
  }-*/;
  
  public native void set(double index, int value) /*-{
    this[index] = value;
  }-*/;
}
