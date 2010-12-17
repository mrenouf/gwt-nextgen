package com.google.gwt.canvas.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class TextMetrics extends JavaScriptObject {
  protected TextMetrics() {
  }
  
  public native double getWidth() /*-{
    return this.width;
  }-*/;
}
