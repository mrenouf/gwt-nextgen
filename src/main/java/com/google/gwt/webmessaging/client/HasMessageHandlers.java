package com.google.gwt.webmessaging.client;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.HandlerRegistration;

public interface HasMessageHandlers extends EventHandler {
  HandlerRegistration addMessageHandler(MessageHandler handler);
}
