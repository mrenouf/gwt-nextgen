package com.google.gwt.nextgen.canvas.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class CanvasGradient extends JavaScriptObject {
  protected CanvasGradient() {
  }

  public native void addColorStop(double offset, String color) /*-{
    this.addColorStop(offset, color);
  }-*/;
}
