package com.google.gwt.websocket.client.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface is a public source of
 * {@link CloseEvent} events.
 */
public interface HasCloseHandlers extends HasHandlers {
  /**
   * Adds an {@link CloseEvent} handler.
   * 
   * @param handler the handler
   * @return the registration for the event
   */
  HandlerRegistration addCloseHandler(CloseHandler handler);
}
