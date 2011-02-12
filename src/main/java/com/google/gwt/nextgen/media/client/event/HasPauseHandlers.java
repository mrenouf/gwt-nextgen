package com.google.gwt.nextgen.media.client.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface is a public source of
 * {@link PauseEvent} events.
 */
public interface HasPauseHandlers extends HasHandlers {
  /**
   * Adds a {@link PauseEvent} handler.
   * 
   * @param handler the handler
   * @return the registration for the event
   */
  HandlerRegistration addPauseHandler(PauseHandler handler);
}
