package com.google.gwt.shared.client;

import com.google.gwt.core.client.JavaScriptObject;

public class JSON {
	public static native final String stringify(JavaScriptObject obj) /*-{
		return JSON.stringify(obj);
	}-*/;
	
	public static native final JavaScriptObject parse(String json) /*-{
		return JSON.parse(json);
	}-*/;
}
