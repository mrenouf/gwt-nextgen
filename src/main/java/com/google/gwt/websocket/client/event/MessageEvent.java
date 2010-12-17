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
package com.google.gwt.websocket.client.event;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * Represents a native message event.
 */
public class MessageEvent extends DomEvent<MessageHandler> {

  /**
   * Event type for message events. Represents the meta-data associated with this
   * event.
   */
  private static final Type<MessageHandler> TYPE = new Type<MessageHandler>(
      "message", new MessageEvent());

  /**
   * Gets the event type associated with message events.
   * 
   * @return the handler type
   */
  public static Type<MessageHandler> getType() {
    return TYPE;
  }

  public String getData() {
	  return getNativeEvent().<NativeMessageEvent>cast().getData();
  }
  
  /**
   * Protected constructor, use
   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
   * to fire open events.
   */
  protected MessageEvent() {
  }

  @Override
  public final Type<MessageHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MessageHandler handler) {
    handler.onMessage(this);
  }

}
