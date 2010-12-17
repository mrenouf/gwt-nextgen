package com.google.gwt.websocket.client.event;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler interface for {@link OpenEvent} events.
 */
public interface OpenHandler extends EventHandler {

  /**
   * Called when {@link OpenEvent} is fired.
   * 
   * @param event the {@link OpenEvent} that was fired
   */
  void onOpen(OpenEvent event);
}
