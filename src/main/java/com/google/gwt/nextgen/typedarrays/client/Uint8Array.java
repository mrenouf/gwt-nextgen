package com.google.gwt.nextgen.typedarrays.client;

import com.google.gwt.core.client.JsArrayNumber;


public final class Uint8Array extends TypedArray {
  protected Uint8Array() {}

  public static final int BYTES_PER_ELEMENT = 1;

  /**
   * Create a new ArrayBuffer with enough bytes to hold length elements of this
   * typed array, then creates a Uint8Array referring to the full buffer.
   * As with a directly constructed ArrayBuffer, the contents are initialized to
   * 0. If the requested number of bytes could not be allocated an exception is
   * raised.
   *
   * @param length the length of the array in int8 (1 byte) elements
   * @return A new Uint8Array instance
   */
  public static native Uint8Array create(double length) /*-{
    return new Uint8Array(length);
  }-*/;

  /**
   * Create a new ArrayBuffer with enough bytes to hold array.length elements of
   * this typed array, then creates a Uint8Array referring to the full
   * buffer. The contents of the new view are initialized to the contents of the
   * given array or typed array, with each element converted to the appropriate
   * typed array type.
   *
   * @param array The array to copy
   * @return A new Uint8Array for this type
   */
  public static native Uint8Array of(Uint8Array array) /*-{
    return new Uint8Array(array);
  }-*/;

  /**
   * Create a new ArrayBuffer with enough bytes to hold array.length elements of
   * this typed array, then creates a Uint8Array referring to the full
   * array. The contents of the new view are initialized to the contents of the
   * given array, with each element converted to the appropriate typed array type.
   *
   * @param array The array to copy
   * @return A new Uint8Array for this type
   */

  public static native Uint8Array of(JsArrayNumber array) /*-{
    return new Uint8Array(array);
  }-*/;

  /**
   * Create a new Uint8Array object using the passed ArrayBuffer for its
   * storage, the Uint8Array spans the entire ArrayBuffer range.
   * <p>
   * The length of the ArrayBuffer must be a multiple of the element size
   * of the specific type, or an exception is raised.
   *
   * @param buffer
   * @return
   */
  public static native Uint8Array of(ArrayBuffer buffer) /*-{
    return new Uint8Array(buffer, byteOffset);
  }-*/;

  /**
   * Create a new Uint8Array object using the passed ArrayBuffer for its
   * storage. The byteOffset indicates the offset in bytes from the start of the
   * ArrayBuffer. The Uint8Array extends from the given byteOffset until the end
   * of the ArrayBuffer.
   * <p>
   * The given byteOffset must be a multiple of the element size of the specific
   * type, otherwise an exception is raised.
   * <p>
   * The length of the ArrayBuffer minus the byteOffset must be a multiple of
   * the element size of the specific type, or an exception is raised.
   *
   * @param buffer The buffer to use for storage
   * @param byteOffset The offset, in bytes from the start of the ArrayBuffer
   * @return a new Typed array instance
   */
  public static native Uint8Array of(ArrayBuffer buffer, double byteOffset) /*-{
    return new Uint8Array(buffer, byteOffset);
  }-*/;

  /**
   * Create a new Uint8Array object using the passed ArrayBuffer for its
   * storage.
   * <p>
   * The given byteOffset must be a multiple of the element size of the specific
   * type, otherwise an exception is raised.
   * <p>
   * If a given byteOffset and length references an area beyond the end of the
   * ArrayBuffer an exception is raised.
   *
   * @param buffer
   *          The buffer to use for storage
   * @param byteOffset
   *          The offset, in bytes from the start of the ArrayBuffer
   * @param length
   *          the count of elements from the offset that this Uint8Array will
   *          reference
   * @return a new Typed array instance
   */

  public static native Uint8Array of(ArrayBuffer buffer, double byteOffset, double length) /*-{
    return new Uint8Array(buffer, byteOffset, length);
  }-*/;

  /**
   * Get an element in the array
   * @param index The offset to retrieve
   * return value A value in the range [0, 255].
   */
  public native int get(double index) /*-{
    return this[index];
  }-*/;

  /**
   * Set an element in the array
   * @param index The offset to change
   * @param value A value in the range [0, 255]
   */
  public native void set(double index, int value) /*-{
    this[index] = value;
  }-*/;

  /**
   * Returns a new Uint8Array view of the ArrayBuffer store for this Uint8Array,
   * referencing the elements at begin, inclusive, up to end, exclusive. If
   * either begin or end is negative, it refers to an index from the end of the
   * array, as opposed to from the beginning.
   *
   * @param begin The start of the subarray (inclusive)
   * @return A new Uint8Array view of the ArrayBuffer store
   */
  public native final Uint8Array subarray(double begin) /*-{
    return this.subarray(begin);
  }-*/;

  /**
   * Returns a new Uint8Array view of the ArrayBuffer store for this Uint8Array,
   * referencing the elements at begin, inclusive, up to end, exclusive. If
   * either begin or end is negative, it refers to an index from the end of the
   * array, as opposed to from the beginning.
   *
   * @param begin The start of the subarray (inclusive)
   * @param end The end of the subarray (exclusive)
   * @return A new Uint8Array view of the ArrayBuffer store
   */
  public native final Uint8Array subarray(double begin, double end) /*-{
    return this.subarray(begin, end);
  }-*/;
}
