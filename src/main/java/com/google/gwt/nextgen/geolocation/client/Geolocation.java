package com.google.gwt.nextgen.geolocation.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;

public final class Geolocation extends JavaScriptObject {
  protected Geolocation() {}
  
  public static native boolean isSupported() /*-{
    return (!!$wnd.navigator) && (typeof $wnd.navigator.geolocation == "object");
  }-*/;

  public static Geolocation getInstance() {
    if (!Geolocation.isSupported())
      throw new UnsupportedOperationException("Geolocation is not supported by this browser.");
    return nativeGetInstance();
  }
  
  private static native Geolocation nativeGetInstance() /*-{
    return $wnd.navigator.geolocation;
  }-*/;
  
  
  // Called from JSNI
  private static void firePositionError(PositionHandler handler,
      PositionError error) {
    if (handler == null) {
      return;
    }

    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh != null) {
      try {
        handler.onError(error);
      } catch (Throwable e) {
        ueh.onUncaughtException(e);
      }
    } else {
      handler.onError(error);
    }
  }

  // Called from JSNI
  private static void firePositionSuccess(PositionHandler handler,
      Position position) {
    if (handler == null) {
      return;
    }

    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh != null) {
      try {
        handler.onPosition(position);
      } catch (Throwable e) {
        ueh.onUncaughtException(e);
      }
    } else {
      handler.onPosition(position);
    }
  }

  /**
   * Stop watching the current position.
   * 
   * @param watchId the identifier of the watch to stop
   */
  public native void clearWatch(int watchId) /*-{
    this.clearWatch(watchId);
  }-*/;

  /**
   * Obtains a new position. A @{link {@link PositionEvent} will be passed to
   * the supplied handler when the operation completes. If successful, the event
   * will contain the current {@link Position}. If none of the location
   * providers find a good fix, a {@link PositionError} will describe the
   * result.
   * 
   * @param handler the {@link PositionHandler handler} which will receive a
   *          {@link PositionEvent} when the operation completes.
   */
  public native void getCurrentPosition(PositionHandler handler) /*-{
    this.getCurrentPosition(
      function(position) {
        @com.google.gwt.nextgen.geolocation.client.Geolocation::firePositionSuccess(Lcom/google/gwt/nextgen/geolocation/client/PositionHandler;Lcom/google/gwt/nextgen/geolocation/client/Position;)(handler, position);
      }, 
      function(error) {
        @com.google.gwt.nextgen.geolocation.client.Geolocation::firePositionError(Lcom/google/gwt/nextgen/geolocation/client/PositionHandler;Lcom/google/gwt/nextgen/geolocation/client/PositionError;)(handler, error);
      }
    );
  }-*/;

  /**
   * Obtains a new position. A @{link {@link PositionEvent} will be passed to
   * the supplied handler when the operation completes. If successful, the event
   * will contain the current {@link Position}. If none of the location
   * providers find a good fix, a {@link PositionError} will describe the
   * result.
   * 
   * @param handler the {@link PositionHandler handler} which will receive a
   *          {@link PositionEvent} when the operation completes.
   * @param options specifies the {@link PositionOptions options} to use for
   *          this request
   */
  public native void getCurrentPosition(PositionHandler handler,
      PositionOptions options) /*-{
    this.getCurrentPosition(
      function(position) {
        @com.google.gwt.nextgen.geolocation.client.Geolocation::firePositionSuccess(Lcom/google/gwt/nextgen/geolocation/client/PositionHandler;Lcom/google/gwt/nextgen/geolocation/client/Position;)(handler, position);
      }, 
      function(error) {
        @com.google.gwt.nextgen.geolocation.client.Geolocation::firePositionError(Lcom/google/gwt/nextgen/geolocation/client/PositionHandler;Lcom/google/gwt/nextgen/geolocation/client/PositionError;)(handler, error);
      },
      options
    );
  }-*/;

  /**
   * Repeatedly obtains a new position. If successful, a {@link PositionEvent}
   * will be supplied containing the current position as soon a fix is available
   * and whenever the position changes significantly, subject to a maximum
   * callback frequency. If there is a fatal error which would prevent a fix
   * from ever being obtained a single {@link PositionEvent} will be fired
   * containing the {@link PositionError} describing the problem.
   * 
   * @param handler a {@link PositionHandler handler} which will receive
   *          {@link PositionEvent events} when a position update is available,
   *          or if any errors prevent a position fix from ever being obtained
   *          by this watch.
   * @return A unique watch identifier
   */
  public native int watchPosition(PositionHandler handler) /*-{
    return this.watchPosition(
      function(position) {
        @com.google.gwt.nextgen.geolocation.client.Geolocation::firePositionSuccess(Lcom/google/gwt/nextgen/geolocation/client/PositionHandler;Lcom/google/gwt/nextgen/geolocation/client/Position;)(handler, position);
      }, 
      function(error) {
        @com.google.gwt.nextgen.geolocation.client.Geolocation::firePositionError(Lcom/google/gwt/nextgen/geolocation/client/PositionHandler;Lcom/google/gwt/nextgen/geolocation/client/PositionError;)(handler, error);
      }
    );
  }-*/;

  /**
   * Repeatedly obtains a new position. If successful, a {@link PositionEvent}
   * will be supplied containing the current position as soon a fix is available
   * and whenever the position changes significantly, subject to a maximum
   * callback frequency. If there is a fatal error which would prevent a fix
   * from ever being obtained a single {@link PositionEvent} will be fired
   * containing the {@link PositionError} describing the problem.
   * 
   * @param handler a {@link PositionHandler handler} which will receive
   *          {@link PositionEvent events} when available and whenever the
   *          position changes significantly, or if any errors prevent a
   *          position fix from ever being obtained by this watch.
   * @param options specifies the {@link PositionOptions options} to use for
   *          this request
   * @return A unique watch identifier
   */
  public native int watchPosition(PositionHandler handler,
      PositionOptions options) /*-{
    return this.watchPosition(
      function(position) {
        @com.google.gwt.nextgen.geolocation.client.Geolocation::firePositionSuccess(Lcom/google/gwt/nextgen/geolocation/client/PositionHandler;Lcom/google/gwt/nextgen/geolocation/client/Position;)(handler, position);
      }, 
      function(error) {
        @com.google.gwt.nextgen.geolocation.client.Geolocation::firePositionError(Lcom/google/gwt/nextgen/geolocation/client/PositionHandler;Lcom/google/gwt/nextgen/geolocation/client/PositionError;)(handler, error);
      },
      options
    );
  }-*/;
}
