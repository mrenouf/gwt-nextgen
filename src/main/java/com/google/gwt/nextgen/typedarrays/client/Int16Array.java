package com.google.gwt.nextgen.typedarrays.client;

import com.google.gwt.core.client.JsArrayNumber;


public final class Int16Array extends TypedArray {
  protected Int16Array() {}

  public static final int BYTES_PER_ELEMENT = 2;

  /**
   * Create a new ArrayBuffer with enough bytes to hold length elements of this
   * typed array, then creates an Int16Array referring to the full buffer.
   * As with a directly constructed ArrayBuffer, the contents are initialized to
   * 0. If the requested number of bytes could not be allocated an exception is
   * raised.
   *
   * @param length the length of the array in int16 (2 byte) elements
   * @return A new Int16Array instance
   */
  public static native Int16Array create(double length) /*-{
    return new Int16Array(length);
  }-*/;

  /**
   * Create a new ArrayBuffer with enough bytes to hold array.length elements of
   * this typed array, then creates an Int16Array referring to the full
   * buffer. The contents of the new view are initialized to the contents of the
   * given array or typed array, with each element converted to the appropriate
   * typed array type.
   *
   * @param array The array to copy
   * @return A new TypedArray for this type
   */
  public static native Int16Array of(TypedArray array) /*-{
    return new Int16Array(array);
  }-*/;

  /**
   * Create a new ArrayBuffer with enough bytes to hold array.length elements of
   * this typed array, then creates an Int16Array referring to the full
   * array. The contents of the new view are initialized to the contents of the
   * given array, with each element converted to the appropriate typed array type.
   *
   * @param array The array to copy
   * @return A new TypedArray for this type
   */

  public static native Int16Array of(JsArrayNumber array) /*-{
    return new Int16Array(array);
  }-*/;

  /**
   * Create a new Int16Array object using the passed ArrayBuffer for its
   * storage, the Int16Array spans the entire ArrayBuffer range.
   * <p>
   * The length of the ArrayBuffer must be a multiple of the element size
   * of the specific type, or an exception is raised.
   *
   * @param buffer
   * @return
   */
  public static native Int16Array of(ArrayBuffer buffer) /*-{
    return new Int16Array(buffer, byteOffset);
  }-*/;

  /**
   * Create a new Int16Array object using the passed ArrayBuffer for its
   * storage. The byteOffset indicates the offset in bytes from the start of the
   * ArrayBuffer. The Int16Array extends from the given byteOffset until the end
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
  public static native Int16Array of(ArrayBuffer buffer, double byteOffset) /*-{
    return new Int16Array(buffer, byteOffset);
  }-*/;

  /**
   * Create a new Int16Array object using the passed ArrayBuffer for its
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
   *          the count of elements from the offset that this TypedArray will
   *          reference
   * @return a new Typed array instance
   */

  public static native Int16Array of(ArrayBuffer buffer, double byteOffset, double length) /*-{
    return new Int16Array(buffer, byteOffset, length);
  }-*/;
  /**
   * Get an element in the array
   * @param index The offset to retrieve
   * return value A value in the range [-32768, 32767]
   */
  public native int get(double index) /*-{
    this.get(index);
  }-*/;

  /**
   * Set an element in the array
   * @param index The offset to change
   * @param value A value in the range of [-32768, 32767]
   */
  public native void set(double index, int value) /*-{
    this.set(index, value);
  }-*/;

  /**
   * Returns a new TypedArray view of the ArrayBuffer store for this TypedArray,
   * referencing the elements at begin, inclusive, up to end, exclusive. If
   * either begin or end is negative, it refers to an index from the end of the
   * array, as opposed to from the beginning.
   *
   * @param begin The start of the subarray (inclusive)
   * @return A new TypedArray view of the ArrayBuffer store
   */
  public native final Int16Array subarray(double begin) /*-{
    return this.subarray(begin);
  }-*/;

  /**
   * Returns a new TypedArray view of the ArrayBuffer store for this TypedArray,
   * referencing the elements at begin, inclusive, up to end, exclusive. If
   * either begin or end is negative, it refers to an index from the end of the
   * array, as opposed to from the beginning.
   *
   * @param begin The start of the subarray (inclusive)
   * @param end The end of the subarray (exclusive)
   * @return A new TypedArray view of the ArrayBuffer store
   */
  public native final Int16Array subarray(double begin, double end) /*-{
    return this.subarray(begin, end);
  }-*/;
}
