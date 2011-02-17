package com.google.gwt.nextgen.file.client.event;

import com.google.gwt.nextgen.shared.client.ProgressEvent;

public interface AbortHandler {
  public void onAbort(ProgressEvent error);
}
