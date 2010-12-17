package com.google.gwt.media.client.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface is a public source of
 * {@link EndedEvent} events.
 */
public interface HasEndedHandlers extends HasHandlers {
  /**
   * Adds a {@link EndedEvent} handler.
   * 
   * @param handler the handler
   * @return the registration for the event
   */
  HandlerRegistration addEndedHandler(EndedHandler handler);
}
