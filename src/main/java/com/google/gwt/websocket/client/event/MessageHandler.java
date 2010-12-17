package com.google.gwt.websocket.client.event;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler interface for {@link MessageEvent} events.
 */
public interface MessageHandler extends EventHandler {

  /**
   * Called when a {@link MessageEvent} is fired.
   * 
   * @param event the {@link MessageEvent} that was fired
   */
  void onMessage(MessageEvent event);
}
