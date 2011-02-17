package com.google.gwt.nextgen.file.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.TagName;

/**
 * An HTML File input control as defined by
 * <a href="http://dev.w3.org/html5/spec/Overview.html#file-upload-state">W3C</a>
 */
@TagName("input")
public final class FileInputElement extends InputElement {

  public static FileInputElement create() {
    Element e = Document.get().createFileInputElement();
    return FileInputElement.class.cast(e);
  }

  public static FileInputElement as(Element e) {
    return FileInputElement.class.cast(e);
  }

  protected FileInputElement() {
  }

  public void setMultiple(boolean multiple) {
    if (multiple) {
      setAttribute("multiple", null);
    } else {
      removeAttribute("multiple");
    }
  }

  public native FileList getFiles() /*-{
    return this.files;
  }-*/;

}
