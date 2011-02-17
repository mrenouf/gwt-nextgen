package com.google.gwt.nextgen.file.client;

import com.google.gwt.dev.jjs.ast.HasName;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

public class FileUpload extends Widget implements HasName, HasChangeHandlers {

  public FileUpload() {
    setElement(FileInputElement.create());
  }

  /**
   * Sets whether this widget is enabled.
   *
   * @param enabled <code>true</code> to enable the widget, <code>false</code>
   *          to disable it
   */
  public void setEnabled(boolean enabled) {
    getElement().setPropertyBoolean("disabled", !enabled);
  }

  /**
   * Sets whether selection multiple files is permitted.
   *
   * @param enabled <code>true</code> to allow multiple files, <code>false</code>
   *          to restrict to a single file
   */
  public void setMultiple(boolean multiple) {
    FileInputElement.as(getElement()).setMultiple(multiple);
  }

  public void setName(String name) {
    getInputElement().setName(name);
  }

  @Override
  public String getName() {
    return getInputElement().getName();
  }

  public FileList getFiles() {
    return FileInputElement.as(getElement()).getFiles();
  }

  private InputElement getInputElement() {
    return getElement().cast();
  }

  public HandlerRegistration addChangeHandler(ChangeHandler handler) {
    return addDomHandler(handler, ChangeEvent.getType());
  }
}
