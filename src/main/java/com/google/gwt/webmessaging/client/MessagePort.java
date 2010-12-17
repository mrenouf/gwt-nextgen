package com.google.gwt.webmessaging.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;

public final class MessagePort extends JavaScriptObject implements HasMessageHandlers {
  protected MessagePort() {}
  
  /**
   * Posts a message through the channel, optionally with the given ports.
   * 
   * Throws an INVALID_STATE_ERR if the ports array is not null and it contains
   * either null entries, duplicate ports, or the source or target port.
   * 
   * @param message
   * @param targetOrigin
   * @param ports
   */
  void postMessage(JavaScriptObject message, String targetOrigin, MessagePort... ports) {
    
  }
  
  /**
   * Begins dispatching messages received on the port.
   */
  public native void start() /*-{
    this.start();
  }-*/;
  
  /**
   * Disconnects the port, so that it is no longer active.
   */
  public native void close() /*-{
    this.close();
  }-*/;

@Override
public HandlerRegistration addMessageHandler(MessageHandler handler) {
	// TODO Auto-generated method stub
	return null;
}
  
}
