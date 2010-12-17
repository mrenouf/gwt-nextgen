package com.google.gwt.webmessaging.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class MessageChannel extends JavaScriptObject {
  protected MessageChannel() {}
  
  public static native MessageChannel create() /*-{
    return new MessageChannel();
  }-*/;
  
  public native MessagePort getPort1() /*-{
    return this.port1;
  }-*/;
  
  public native MessagePort getPort2() /*-{
    return this.port2;
  }-*/;
  
  
}
