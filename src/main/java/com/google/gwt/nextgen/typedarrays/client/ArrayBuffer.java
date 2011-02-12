package com.google.gwt.nextgen.typedarrays.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class ArrayBuffer extends JavaScriptObject {
  protected ArrayBuffer() {}
  /**
   * Creates a new ArrayBuffer of the given length in bytes. The contents of the
   * ArrayBuffer are initialized to 0. If the requested number of bytes could
   * not be allocated an exception is raised.
   *
   * @param length The length of the ArrayBuffer
   * @return A new ArrayBuffer
   */
  public static native ArrayBuffer create(double length) /*-{
    return new ArrayBuffer(length);
  }-*/;

  /**
   * The length of the ArrayBuffer in bytes, as fixed at construction time.
   * @return the length of the ArrayBuffer in bytes
   */
  public native double getByteLength() /*-{
    return this.byteLength;
  }-*/;

}
