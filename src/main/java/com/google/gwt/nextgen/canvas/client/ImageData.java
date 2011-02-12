package com.google.gwt.nextgen.canvas.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class ImageData extends JavaScriptObject {

  protected ImageData() {
  }

  public native double getWidth() /*-{
    return this.width;
  }-*/;

  public native double getHeight() /*-{
    return this.height;
  }-*/;
  
  
  public native CanvasPixelArray getdata() /*-{
    return this.data;
  }-*/;
}
