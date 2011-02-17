package com.google.gwt.nextgen.file.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.nextgen.file.client.event.AbortHandler;
import com.google.gwt.nextgen.file.client.event.ErrorHandler;
import com.google.gwt.nextgen.file.client.event.LoadEndHandler;
import com.google.gwt.nextgen.file.client.event.LoadHandler;
import com.google.gwt.nextgen.file.client.event.ProgressHandler;
import com.google.gwt.nextgen.file.client.event.StartHandler;
import com.google.gwt.nextgen.shared.client.ProgressEvent;
import com.google.gwt.nextgen.typedarrays.client.ArrayBuffer;

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

  public static final class ReadyState {
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
  }

  /**
   * Start an asynchronous read operation to load the data represented by the blob.
   * The result, if successful will be available from {@linkplain #getArrayBufferResult()}
   *
   * @param blob The data source to read from.
   */
  public native void readAsArrayBuffer(Blob blob) /*-{
    this.readAsArrayBuffer(blob);
  }-*/;

  /**
   * Start an asynchronous read operation to load the data represented by the blob.
   * The result, if successful will be available from {@linkplain #getStringResult()}
   *
   * @param blob The data source to read from.
   */
  public native void readAsBinaryString( Blob blob) /*-{
    this.readAsBinaryString(blob);
  }-*/;

  /**
   * Start an asynchronous read operation to load the data represented by the blob.
   * The result, if successful will be available from {@linkplain #getStringResult()}
   *
   * @param blob The data source to read from.
   */
  public native void readAsText(Blob blob) /*-{
    this.readAsText(blob);
  }-*/;

  /**
   * Start an asynchronous read operation to load the data represented by the blob.
   * The result, if successful will be available from {@linkplain #getStringResult()}
   *
   * @param blob The data source to read from.
   * @param encoding
   *          a character set identifier as defined by
   *          <a href="http://www.iana.org/assignments/character-sets">IANA</a>
   */
  public native void readAsText(Blob blob, String encoding) /*-{
    this.readAsText(blob, encoding);
  }-*/;

  /**
   * Start an asynchronous read operation to load the data represented by the
   * blob. The result, if successful will be available from
   * {@linkplain #getStringResult()}
   * <p>
   * <b>Note:</b> URL length limitiations for Data URLs limit the usefulness of
   * this call. A user agent may throw an ENCODING_ERR for blob arguments which,
   * when encoded as Data URLs, exceed URL length limitations for that user
   * agent.
   *
   * @param blob
   *          The data source to read from.
   */
  public native void readAsDataURL(Blob blob) /*-{
    this.readAsDataURL(blob);
  }-*/;

  private native JavaScriptObject getResult() /*-{
    return this.result || null;
  }-*/;

  /**
   * Use to access the result after a call to {@linkplain #readAsText(Blob)},
   * {@linkplain #readAsDataURL(Blob)} or {@linkplain #readAsBinaryString(Blob)}
   *
   * @return a String containing partially or fully read data, or null,
   *         depending on the current {@linkplain #getReadyState() state}
   */
  public native String getStringResult() /*-{
    return this.result || null;
  }-*/;

  /**
   * Use to access the result after a call to
   * {@linkplain #readAsArrayBuffer(Blob)}.
   *
   * @return an ArrayBuffer containing partially or fully read data, or null,
   *         depending on the current {@linkplain #getReadyState() state}
   */
  public ArrayBuffer getArrayBufferResult() {
    return getResult().cast();
  }

  public native int getReadyState() /*-{
    return this.readyState || null;
  }-*/;

  public native FileError getError() /*-{
    return this.error || null;
  }-*/;

  private static void fireErrorEvent(ErrorHandler handler, ProgressEvent event) {
    if (handler == null) {
      return;
    }

    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh != null) {
      try {
        handler.onError(event);
      } catch (Throwable e) {
        ueh.onUncaughtException(e);
      }
    } else {
      handler.onError(event);
    }
  }

  public native void addErrorHandler(ErrorHandler handler) /*-{
    this.addEventListener("error", function(progress) {
        @com.google.gwt.nextgen.file.client.FileReader::fireErrorEvent(Lcom/google/gwt/nextgen/file/client/event/ErrorHandler;Lcom/google/gwt/nextgen/shared/client/ProgressEvent;)(handler, progress);
    });
  }-*/;

  private static void fireStartEvent(StartHandler handler, ProgressEvent event) {
    if (handler == null) {
      return;
    }

    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh != null) {
      try {
        handler.onStart(event);
      } catch (Throwable e) {
        ueh.onUncaughtException(e);
      }
    } else {
      handler.onStart(event);
    }
  }

  public native void addStartHandler(StartHandler handler) /*-{
    this.addEventListener("start", function(progress) {
        @com.google.gwt.nextgen.file.client.FileReader::fireStartEvent(Lcom/google/gwt/nextgen/file/client/event/StartHandler;Lcom/google/gwt/nextgen/shared/client/ProgressEvent;)(handler, progress);
    });
  }-*/;

  private static void fireProgressEvent(ProgressHandler handler, ProgressEvent event) {
    if (handler == null) {
      return;
    }

    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh != null) {
      try {
        handler.onProgress(event);
      } catch (Throwable e) {
        ueh.onUncaughtException(e);
      }
    } else {
      handler.onProgress(event);
    }
  }

  public native void addProgressHandler(ProgressHandler handler) /*-{
    this.addEventListener("progress", function(progress) {
        @com.google.gwt.nextgen.file.client.FileReader::fireProgressEvent(Lcom/google/gwt/nextgen/file/client/event/ProgressHandler;Lcom/google/gwt/nextgen/shared/client/ProgressEvent;)(handler, progress);
    });
  }-*/;

  private static void fireLoadEvent(LoadHandler handler, ProgressEvent event) {
    if (handler == null) {
      return;
    }

    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh != null) {
      try {
        handler.onLoad(event);
      } catch (Throwable e) {
        ueh.onUncaughtException(e);
      }
    } else {
      handler.onLoad(event);
    }
  }

  public native void addLoadHandler(LoadHandler handler) /*-{
    this.addEventListener("load", function(Load) {
        @com.google.gwt.nextgen.file.client.FileReader::fireLoadEvent(Lcom/google/gwt/nextgen/file/client/event/LoadHandler;Lcom/google/gwt/nextgen/shared/client/ProgressEvent;)(handler, Load);
    });
  }-*/;

  private static void fireLoadEndEvent(LoadEndHandler handler, ProgressEvent event) {
    if (handler == null) {
      return;
    }

    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh != null) {
      try {
        handler.onLoadEnd(event);
      } catch (Throwable e) {
        ueh.onUncaughtException(e);
      }
    } else {
      handler.onLoadEnd(event);
    }
  }

  public native void addLoadEndHandler(LoadEndHandler handler) /*-{
    this.addEventListener("loadend", function(LoadEnd) {
        @com.google.gwt.nextgen.file.client.FileReader::fireLoadEndEvent(Lcom/google/gwt/nextgen/file/client/event/LoadEndHandler;Lcom/google/gwt/nextgen/shared/client/ProgressEvent;)(handler, LoadEnd);
    });
  }-*/;

  private static void fireAbortEvent(AbortHandler handler, ProgressEvent event) {
    if (handler == null) {
      return;
    }

    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh != null) {
      try {
        handler.onAbort(event);
      } catch (Throwable e) {
        ueh.onUncaughtException(e);
      }
    } else {
      handler.onAbort(event);
    }
  }

  public native void addAbortHandler(AbortHandler handler) /*-{
    this.addEventListener("abort", function(Abort) {
        @com.google.gwt.nextgen.file.client.FileReader::fireAbortEvent(Lcom/google/gwt/nextgen/file/client/event/AbortHandler;Lcom/google/gwt/nextgen/shared/client/ProgressEvent;)(handler, Abort);
    });
  }-*/;
}
