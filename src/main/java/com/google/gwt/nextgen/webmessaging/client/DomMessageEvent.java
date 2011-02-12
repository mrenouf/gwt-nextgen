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
package com.google.gwt.nextgen.webmessaging.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.dom.client.DomEvent.Type;

public final class DomMessageEvent extends JavaScriptObject {
  protected DomMessageEvent() {}
  
  /**
   * Returns the data of the message.
   * @param <T> The JavaScript type of the message
   * @return the data of the message.
   */
  public native <T extends JavaScriptObject> T getData() /*-{
   return this.data;
  }-*/;
    
  /**
   * Returns the origin of the message, for server-sent events and cross-document messaging.
   * @return the origin of the message
   */
  public native String getOrigin() /*-{
    return this.origin;
  }-*/;
  
  /**
   * Returns the last event ID, for server-sent events.
   * @return the last event ID
   */
  public native String getLastEventId() /*-{
    return this.lastEventId;
  }-*/;
  
  /**
   * Returns the WindowProxy of the source window, for cross-document messaging.
   * @return the WindowProxy of the source window
   */
  public native WindowProxy getSource() /*-{
    return this.source;
  }-*/;

  /**
   * Returns the MessagePortArray sent with the message, for cross-document messaging and channel messaging.
   * @return an array of {@linkplain MessagePort MessagePorts}
   */
  public native JsArray<MessagePort> getPorts() /*-{
    return this.ports;
  }-*/;

	public static Type<MessageHandler> getType() {
			// TODO Auto-generated method stub
			return null;
	}
}
