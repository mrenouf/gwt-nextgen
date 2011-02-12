package com.google.gwt.nextgen.typedarrays.client;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * The typed array view types represent a view of an {@linkplain ArrayBuffer}
 * that allows for indexing and manipulation. The length of each of these is
 * fixed.
 */
public abstract class TypedArray extends ArrayBufferView {
  protected TypedArray() {}

  /**
   * @return the length of the TypedArray in elements, as fixed at construction
   *         time.
   */
  public final native double getLength() /*-{
    return this.length;
  }-*/;

  /**
   * Set multiple values, reading input values from the array.
   *
   * @param array The source of the values to set
   * @throws JavaScriptException If the length of the given array is out of range for the this array
   */
  public final native void set(TypedArray array) /*-{
    this.set(array);
  }-*/;

  /**
   * Set multiple values, reading input values from the array.
   *
   * @param array The source of the values to set
   * @param offset The index in the current array where values are written.
   * @throws JavaScriptException If the offset plus the length of the given array is out of range for the this array
   */
  public final native void set(TypedArray array, double offset) /*-{
    this.set(array, offset);
  }-*/;

  /**
   * Set multiple values, reading input values from the array.
   *
   * @param array The source of the values to set
   * @throws JavaScriptException If the length of the given array is out of range for the this array
   */
  public final native void set(JsArrayNumber array) /*-{
    this.set(array);
  }-*/;

  /**
   * Set multiple values, reading input values from the array.
   *
   * @param array The source of the values to set
   * @param offset The index in the current array where values are written.
   * @throws JavaScriptException If the offset plus the length of the given array is out of range for the this array
   */
  public final native void set(JsArrayNumber array, double offset) /*-{
    this.set(array, offset);
  }-*/;
}
