package com.google.gwt.nextgen.webmessaging.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.IFrameElement;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

public class WindowProxy extends Widget implements HasMessageHandlers {
  protected WindowProxy() {}
  
  public static native WindowProxy get() /*-{
    return $wnd;
  }-*/;
  
  public static native WindowProxy get(IFrameElement iframe) /*-{
    return iframe.contentWindow;
  }-*/;
  
  public native void postMessage(JavaScriptObject message, String targetOrigin) /*-{
    this.postMessage(message, targetOrigin);
  }-*/;
  
  public native void postMessage(JavaScriptObject message, String targetOrigin, JsArray<MessagePort> ports ) /*-{
    this.postMessage(message, targetOrigin, ports);
  }-*/;

  public static JsArray<MessagePort> jsArray(MessagePort... ports) {
    JsArray<MessagePort> jsArray = JavaScriptObject.createArray().cast();
    for (MessagePort port: ports) {
      jsArray.push(port);
    }
    return jsArray;
  }

  class SimpleHandlerRegistration implements HandlerRegistration {
    public SimpleHandlerRegistration(WindowProxy proxy, MessageHandler handler) {
      
    }
    @Override
    public void removeHandler() {
    }  
  }
  
  public HandlerRegistration addMessageHandler(MessageHandler handler) {
      return addDomHandler(handler, DomMessageEvent.getType());
  }
  
  /*
   * document.addEventListener("message", function(e) {.  .
   *     document.getElementById("test").textContent = e.domain + " said: " + e.data;
   * }, false);
   */
}
