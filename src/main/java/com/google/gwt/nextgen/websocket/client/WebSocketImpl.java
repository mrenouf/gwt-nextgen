/*
 * Copyright 2009 Mark Renouf
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHDIR
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.nextgen.websocket.client;

import com.google.gwt.core.client.JavaScriptObject;

class WebSocketImpl extends JavaScriptObject {

  protected WebSocketImpl() {}

  public native final int getReadyState() /*-{
    return this.readyState;
  }-*/;

  public static final native WebSocketImpl create(WebSocket peer, String url) /*-{
    var socket = new WebSocket(url);
    socket.onopen = function(e) {
      peer.@com.google.gwt.nextgen.websocket.client.WebSocket::handleOpenEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
    }
    socket.onmessage = function(e) {
      peer.@com.google.gwt.nextgen.websocket.client.WebSocket::handleMessageEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
    }
    socket.onerror = function(e) {
      peer.@com.google.gwt.nextgen.websocket.client.WebSocket::handleErrorEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
    }
    socket.onclose = function(e) {
      peer.@com.google.gwt.nextgen.websocket.client.WebSocket::handleCloseEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
    }
    return socket;
  }-*/;

  public native final double getBufferedAmount() /*-{
    return this.bufferedAmount;
  }-*/;

  public native final String getProtocol() /*-{
    return this.protocol;
  }-*/;

  public native final void send(String message) /*-{
    this.send(message);
  }-*/;

  public native final void close() /*-{
    this.close();
  }-*/;
}
