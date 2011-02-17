package com.google.gwt.nextgen.shared.client;

/**
 * <a href="http://www.w3.org/TR/2010/WD-progress-events-20101019/">Progress Events</a><br>
 * W3C Working Draft 19 October 2010
 */
public class ProgressEvent {

  /**
   * Indicates whether the length of the progress is known, or false otherwise.
   * @return true when the length of the progress is known, or false otherwise.
   */
  public native boolean isLengthComputable() /*-{
    return this.isLengthComputable();
  }-*/;

  /**
   * Get the current state of progression.
   * @return the current state of progression.
   */
  public native double getCompleted() /*-{
    return this.loaded;
  }-*/;

  /**
   * Get the length of the progress, or zero if that is unknown.
   * @return the length of the progress, or zero if that is unknown.
   */
  public native double getTotal() /*-{
    return this.total;
  }-*/;
}
