package com.google.gwt.websocket.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ErrorEvent;
import com.google.gwt.event.dom.client.ErrorHandler;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.websocket.client.event.CloseEvent;
import com.google.gwt.websocket.client.event.CloseHandler;
import com.google.gwt.websocket.client.event.MessageEvent;
import com.google.gwt.websocket.client.event.MessageHandler;
import com.google.gwt.websocket.client.event.OpenEvent;
import com.google.gwt.websocket.client.event.OpenHandler;

public class BasicTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.google.gwt.websocket.WebSocketTests";
    }

    /**
     * This test just ensures that the project can be compiled successfully and
     * basic functionality works. Any further tests will need to be done against
     * real browsers.
     */
    public void testCreate() {
    	WebSocket socket = new WebSocket("ws://echo.websocket.org/");
    	socket.addOpenHandler(new OpenHandler() {
			@Override
			public void onOpen(OpenEvent event) {
				GWT.log("Open: " + event);
			}
		});
    	socket.addMessageHandler(new MessageHandler() {
			@Override
			public void onMessage(MessageEvent event) {
				GWT.log("Message: data='" + event.getData() + "'");
			}
		});
    	socket.addErrorHandler(new ErrorHandler() {
			@Override
			public void onError(ErrorEvent event) {
				GWT.log("Error: " + event);
			}
		});
    	socket.addCloseHandler(new CloseHandler() {
			
			@Override
			public void onClose(CloseEvent event) {
				GWT.log("Close: " + event);
			}
		});
    }
}
