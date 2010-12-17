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
package com.google.gwt.media.client.event;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * Represents a native durationchange event.
 */
public class DurationChangeEvent extends DomEvent<DurationChangeHandler> {

  /**
   * Event type for durationchange events. Represents the meta-data associated with this
   * event.
   */
  private static final Type<DurationChangeHandler> TYPE = new Type<DurationChangeHandler>(
      "durationchange", new DurationChangeEvent());

  /**
   * Gets the event type associated with durationchange events.
   * 
   * @return the handler type
   */
  public static Type<DurationChangeHandler> getType() {
    return TYPE;
  }

  /**
   * Protected constructor, use
   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
   * to fire durationchange events.
   */
  protected DurationChangeEvent() {
  }

  @Override
  public final Type<DurationChangeHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DurationChangeHandler handler) {
    handler.onDurationChange(this);
  }

}
