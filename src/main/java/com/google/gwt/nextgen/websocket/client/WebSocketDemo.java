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

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ErrorEvent;
import com.google.gwt.event.dom.client.ErrorHandler;
import com.google.gwt.nextgen.websocket.client.event.CloseEvent;
import com.google.gwt.nextgen.websocket.client.event.CloseHandler;
import com.google.gwt.nextgen.websocket.client.event.MessageEvent;
import com.google.gwt.nextgen.websocket.client.event.MessageHandler;
import com.google.gwt.nextgen.websocket.client.event.OpenEvent;
import com.google.gwt.nextgen.websocket.client.event.OpenHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;

public class WebSocketDemo implements EntryPoint {

	public void onModuleLoad() {
		final WebSocket socket = new WebSocket("ws://echo.websocket.org/");
		final TextArea box = new TextArea();
		socket.addOpenHandler(new OpenHandler() {
			@Override
			public void onOpen(OpenEvent event) {
				Window.alert("Open: " + event);
			}
		});
		socket.addMessageHandler(new MessageHandler() {
			@Override
			public void onMessage(MessageEvent event) {
				box.setText(box.getValue() + "\n" + event.getData());
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
		final TextBox line = new TextBox();
		Button send = new Button("SEND");
		send.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				socket.send(line.getText());
				line.setText("");
			}
		});
		
		HorizontalPanel lp = new HorizontalPanel();
		lp.add(line);
		lp.add(send);
		RootPanel.get().add(box);
		RootPanel.get().add(lp);
		RootPanel.get().add(send);
	}
}
