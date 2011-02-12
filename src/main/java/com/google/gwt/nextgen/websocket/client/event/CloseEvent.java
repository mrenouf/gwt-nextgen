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
package com.google.gwt.nextgen.websocket.client.event;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * Represents a native close event.
 */
public class CloseEvent extends DomEvent<CloseHandler> {

  /**
   * Event type for close events. Represents the meta-data associated with this
   * event.
   */
  private static final Type<CloseHandler> TYPE = new Type<CloseHandler>(
      "close", new CloseEvent());

  /**
   * Gets the event type associated with close events.
   * 
   * @return the handler type
   */
  public static Type<CloseHandler> getType() {
    return TYPE;
  }

  /**
   * Protected constructor, use
   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
   * to fire open events.
   */
  protected CloseEvent() {
  }

  @Override
  public final Type<CloseHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(CloseHandler handler) {
    handler.onClose(this);
  }

}
