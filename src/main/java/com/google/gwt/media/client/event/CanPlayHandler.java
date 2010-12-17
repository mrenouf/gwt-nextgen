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

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler for {@link CanPlayEvent} events.
 */
public interface CanPlayHandler extends EventHandler {
  /**
   * Called when the user agent can resume playback of the media data, but
   * estimates that if playback were to be started now, the media resource could
   * not be rendered at the current playback rate up to its end without having
   * to stop for further buffering of content.
   * 
   * @param event the {@link CanPlayEvent} that was fired
   */
  void onCanPlay(CanPlayEvent event);

}
