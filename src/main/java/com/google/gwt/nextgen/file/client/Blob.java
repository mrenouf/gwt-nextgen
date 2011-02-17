package com.google.gwt.nextgen.file.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * {@linkplain Blob} represents raw data. It provides a method to slice data
 * objects between ranges of bytes into further chunks of raw data. It also
 * provides an attribute representing the size of the chunk of data. The
 * {@linkplain File} interface inherits from this interface.
 */
public class Blob extends JavaScriptObject {
  protected Blob() {}

  /**
   * Returns the size of the Blob object in bytes.
   * @return the size of the Blob object in bytes.
   */
  public final native double getSize() /*-{
    return this.size;
  }-*/;

  /**
   * Returns the ASCII-encoded string in lower case representing the media type
   * of the Blob
   *
   * @return The ASCII-encoded string in lower case representing the media type
   *         of the Blob, expressed as an RFC2046 MIME type. User agents SHOULD
   *         return the MIME type of the Blob, if it is known. If
   *         implementations cannot determine the media type of the Blob, they
   *         MUST return the empty string. A string is a valid MIME type if it
   *         matches the media-type token defined in section 3.7 "Media Types"
   *         of RFC 2616
   */
  public final native String getType() /*-{
    return this.type;
  }-*/;

  /**
   * Returns a new Blob object between the ranges of bytes specified.
   *
   * @param start
   *          a value for the start point of a slice call.
   * @param length
   *          a value for the end point of a slice call as byte offsets from
   *          start.
   * @return a new Blob object between the ranges of bytes specified.
   */
  public final native Blob slice(double start, double length) /*-{
    return this.slice(start, length);
  }-*/;

  /**
   * Returns a new Blob object between the ranges of bytes specified.
   *
   * @param start
   *          a value for the start point of a slice call.
   * @param length
   *          a value for the end point of a slice call as byte offsets from
   *          start.
   * @param an
   *          HTTP/1.1 Content-Type value that should be returned by the
   *          {@link #getType()} method of the returned Blob
   * @return a new Blob object between the ranges of bytes specified.
   */
  public final native Blob slice(double start, double length, String contentType) /*-{
    return this.slice(start, length, contentType);
  }-*/;
}
