package com.google.gwt.nextgen.file.client;

import com.google.gwt.user.client.ui.Widget;

public class FileUpload extends Widget {

  public FileUpload() {
    setElement(FileInputElement.create());
  }

  public void setMultiple(boolean multiple) {
    FileInputElement.as(getElement()).setMultiple(multiple);
  }

  public FileList getFiles() {
    return FileInputElement.as(getElement()).getFiles();
  }
}
