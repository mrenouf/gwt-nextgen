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
package com.google.gwt.nextgen.media.client.event;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler for {@link SeekingEvent} events.
 */
public interface SeekingHandler extends EventHandler {
  /**
   * Called when the user agent is seeking to a new time position in the stream.
   * 
   * @param event the {@link SeekingEvent} that was fired
   */
  void onSeeking(SeekingEvent event);

}
