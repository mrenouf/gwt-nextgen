package com.google.gwt.nextgen.typedarrays.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ArrayBufferView type holds information shared among all of the types of
 * views of {@linkplain ArrayBuffer ArrayBuffers}.
 */
public abstract class ArrayBufferView extends JavaScriptObject {
  protected ArrayBufferView() {}

  /**
   * @return the {@linkplain ArrayBuffer} that this ArrayBufferView references.
   */
  public final native ArrayBuffer getBuffer() /*-{
    return this.buffer;
  }-*/;

  /**
   * @return the offset of this ArrayBufferView from the start of its
   *         {@linkplain ArrayBuffer}, in bytes, as fixed at construction time.
   */
  public final native double getByteOffset() /*-{
    return this.byteOffset;
  }-*/;

  /**
   * @return the length of this ArrayBufferView in bytes, as fixed at
   *         construction time.
   */
  public final native double getByteLength() /*-{
    return this.byteLength;
  }-*/;

}
