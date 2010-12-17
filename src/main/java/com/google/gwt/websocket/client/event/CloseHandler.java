package com.google.gwt.websocket.client.event;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler interface for {@link OpenClose} events.
 */
public interface CloseHandler extends EventHandler {

  /**
   * Called when a {@link CloseEvent} is fired.
   * 
   * @param event the {@link CloseEvent} that was fired
   */
  void onClose(CloseEvent event);
}
