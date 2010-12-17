package com.google.gwt.websocket.client.event;

import com.google.gwt.user.client.Event;

public class NativeMessageEvent extends Event {
	protected NativeMessageEvent() {}
	
	public native final String getData() /*-{
		return this.data;
	}-*/;
}
