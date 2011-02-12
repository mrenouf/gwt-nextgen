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
package com.google.gwt.nextgen.shared.client;

import com.google.gwt.core.client.JavaScriptObject;

public class JSON {
	public static native final String stringify(JavaScriptObject obj) /*-{
		return JSON.stringify(obj);
	}-*/;
	
	public static native final JavaScriptObject parse(String json) /*-{
		return JSON.parse(json);
	}-*/;
}
