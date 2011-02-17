package com.google.gwt.nextgen.file.client;

/**
 * This interface describes a single file in a FileList and exposes its name. It
 * inherits from {@linkplain Blob}.
 */
public final class File extends Blob {
  protected File() {}

  /**
   * Gets rhe name of the file.
   *
   * @return The name of the file. There are numerous file name variations on
   *         different systems; this is merely the name of the file, without
   *         path information.
   */
  public native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * Gets the last modified date of the file.
   *
   * @return The last modified date of the file; on getting, this returns an
   *         HTML5 valid date string. If user agents cannot make this
   *         information available, they MUST return the emtpy string.
   */
  public native String getLastModifiedDate() /*-{
    return this.lastModifiedDate;
  }-*/;
}
