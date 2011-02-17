package com.google.gwt.nextgen.file.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * FileReader rovides methods to read Files or Blobs into memory, and to access
 * the data from those Files or Blobs using progress events and event handler
 * attributes. It is desirable to read data from file systems asynchronously in
 * the main thread of user agents. This interface provides such an asynchronous
 * API, and is specified to be used with the global object Window.
 */
public class FileReader extends JavaScriptObject {

  public static final class FileError extends JavaScriptObject {
    public static final int NOT_FOUND_ERR = 1;
    public static final int SECURITY_ERR = 2;
    public static final int ABORT_ERR = 3;
    public static final int NOT_READABLE_ERR = 4;
    public static final int ENCODING_ERR = 5;

    public native int getCode() /*-{
      return this.code;
    }-*/;
  }
  protected FileReader() {}

  public static native FileReader createNew() /*-{
    return new FileReader();
  }-*/;

  /** The object has been constructed, and there are no pending reads. */
  public static final int EMPTY = 0;

  /**
   * A {@linkplain File} or {@linkplain Blob} is being read. One of the read
   * methods is being processed.
   */
  public static final int LOADING = 1;

  /**
   * The entire {@linkplain File} or {@linkplain Blob} has been read into
   * memory, or a file error occurred during read, or the read was aborted using
   * abort(). The FileReader is no longer reading a {@linkplain File} or
   * {@linkplain Blob}.
   */
  public static final int DONE = 2;

  public native void readAsArrayBuffer(Blob blob) /*-{
    this.readAsArrayBuffer(blob);
  }-*/;

  public native void readAsBinaryString( Blob blob) /*-{
    this.readAsBinaryString(blob);
  }-*/;

  public native void readAsText(Blob blob) /*-{
    this.readAsText(blob);
  }-*/;

  public native void readAsText(Blob blob, String encoding) /*-{
    this.readAsText(blob, encoding);
  }-*/;

  public native void readAsDataURL(Blob blob) /*-{
    this.readAsDataURL(blob);
  }-*/;

  public native int getReadyState() /*-{
    return this.readyState;
  }-*/;

  public native FileError getError() /*-{
    return this.error;
  }-*/;

//  error: null
//  onabort: null
//  onerror: null
//  onload: null
//  onloadend: null
//  onloadstart: null
//  onprogress: null
//  readyState: 0
//  result: ""

}
