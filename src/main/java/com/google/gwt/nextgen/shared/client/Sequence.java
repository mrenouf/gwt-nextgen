package com.google.gwt.nextgen.shared.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Sequence<T extends JavaScriptObject> extends JavaScriptObject {

  public native T getItem(int item) /*-{
    return this.item(item);
  }-*/;

  public native int getLength() /*-(
    return this.length;
  }-*/;

}
