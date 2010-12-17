package com.google.gwt.websocket.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.UnsafeNativeLong;

class WebSocketImpl extends JavaScriptObject {

	protected WebSocketImpl() {
	}

	public native final int getReadyState() /*-{
		return this.readyState;
	}-*/;

	public static final native WebSocketImpl create(WebSocket peer, String url) /*-{
		var socket = new WebSocket(url);
		socket.onopen = function(e) {
			peer.@com.google.gwt.websocket.client.WebSocket::handleOpenEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
		}
		socket.message = function(e) {
			peer.@com.google.gwt.websocket.client.WebSocket::handleMessageEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
		}
		socket.onerror = function(e) {
			peer.@com.google.gwt.websocket.client.WebSocket::handleErrorEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
		}
		socket.onclose = function(e) {
			peer.@com.google.gwt.websocket.client.WebSocket::handleCloseEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
		}			
	}-*/;

	@UnsafeNativeLong
	public native final long getBufferedAmount() /*-{
		return this.bufferedAmount;
	}-*/;

	public native final String getProtocol() /*-{
		return this.protocol;
	}-*/;

	public native final void send(String message) /*-{
		this.send(content);
	}-*/;

	public native final void close() /*-{
		this.close();
	}-*/;
}