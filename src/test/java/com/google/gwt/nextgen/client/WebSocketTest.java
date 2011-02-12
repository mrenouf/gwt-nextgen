package com.google.gwt.nextgen.client;

import java.util.Date;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.nextgen.websocket.client.WebSocket;
import com.google.gwt.nextgen.websocket.client.event.MessageEvent;
import com.google.gwt.nextgen.websocket.client.event.MessageHandler;
import com.google.gwt.nextgen.websocket.client.event.OpenEvent;
import com.google.gwt.nextgen.websocket.client.event.OpenHandler;
import com.google.gwt.user.client.Window;

public class WebSocketTest extends GWTTestCase {

    @Override
    public String getModuleName() {
      return "com.google.gwt.nextgen.TestCases";
    }

    /**
     * This test just ensures that the project can be compiled successfully and
     * basic functionality works. Any further tests will need to be done against
     * real browsers.
     */
    public void testCreate() {
        // The following guard is intended to force the code through compilation
        // while still avoiding execution since it cannot be tested by HtmlUnit
        if (new Date().getTime() > 0)
            return;

        WebSocket socket = new WebSocket("ws://ws.example.org");
        socket.addOpenHandler(new OpenHandler() {
            @Override
            public void onOpen(OpenEvent event) {
                Window.alert(event.toDebugString());
            }
        });
        socket.addMessageHandler(new MessageHandler() {
            @Override
            public void onMessage(MessageEvent event) {
                Window.alert(event.getData());
            }
        });
        socket.send("Test");
        socket.close();
    }
}
