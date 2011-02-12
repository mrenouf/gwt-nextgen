package com.google.gwt.nextgen.html.client.input;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.TagName;

/**
 * An HTML Range input control as defined by 
 * <a href="http://dev.w3.org/html5/markup/input.range.html">W3C</a> and 
 * <a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/number-state.html#range-state">WHATWG</a>
 */
@TagName("input")
public final class RangeInputElement extends InputElement {

  public static RangeInputElement create() {
    Element e = Document.get().createElement("input");
    e.setAttribute("type", "range");
    return (RangeInputElement) e;
  }

  protected RangeInputElement() {
  }

  public native String getMin() /*-{
    return this.getAttribute('min') || '0';
  }-*/;

  public native void setMin(String min) /*-{
    this.setAttribute('min', min);
  }-*/;

  public native String getMax() /*-{
    return this.getAttribute('max') || '1';
  }-*/;

  public native void setMax(String max) /*-{
    this.setAttribute('max', max);
  }-*/;

  public native String getStep() /*-{
    return this.getAttribute('step') || '1';
  }-*/;

  public native void setStep(String step) /*-{
    this.setAttribute('step', step);
  }-*/;
}
