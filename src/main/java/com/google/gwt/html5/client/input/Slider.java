package com.google.gwt.html5.client.input;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

/**
 * Represents an HTML5 Input 'Range' control (commonly known as a "Slider").
 * This control is typically represented as a draggable handle which can be
 * dragged by the mouse along a path, bounded to a minumum and maximum value.
 */
public class Slider extends Widget implements HasChangeHandlers {

  public Slider() {
    setElement(RangeInputElement.create());
  }

  /**
   * Get the lowest possible value for the range
   * 
   * @return the lowser possible value for the range
   */
  public double getMin() {
    return Double.parseDouble(getElement().<RangeInputElement>cast().getMin());
  }

  /**
   * Set the lowest possible value for the range
   * 
   * @param min the lowest possible value for the range
   */
  public void setMin(double min) {
    getElement().<RangeInputElement>cast().setMin(Double.toString(min));
  }

  /**
   * Get the largest possible value for the range.
   * 
   * @return the largest possible value for the range
   */
  public double getMax() {
    return Double.parseDouble(getElement().<RangeInputElement>cast().getMax());
  }

  /**
   * Set the largest possible value for the range
   * 
   * @param max the largest possible value for the range
   */
  public void setMax(double max) {
    getElement().<RangeInputElement>cast().setMax(Double.toString(max));
  }

  /**
   * Sets the step size for each position along the range
   * 
   * @deprecated Warning - not part of the official spec
   * 
   * @param step The step size for possible position along the range
   */
  public double getStep() {
    return Double.parseDouble(getElement().<RangeInputElement>cast().getStep());
  }

  /**
   * Gets the step size for each position along the range
   * 
   * @deprecated Warning - not part of the official spec
   * 
   * @param step The step size for possible position along the range
   */
  public void setStep(double step) {
    getElement().<RangeInputElement>cast().setStep(Double.toString(step));
  }

  /**
   * Get the current value, as determined by the slider handle position, to the
   * the nearest step size.
   * 
   * @return The current value of the slider
   */
  public double getValue() {
    return Double.parseDouble(getElement().<RangeInputElement>cast().getValue());
  }

  /**
   * Set the current value of the slider and move the slider handler to the
   * appropriate position, to the nearest step size.
   * 
   * @param value The value to set
   */
  public void setValue(double value) {
    getElement().<RangeInputElement>cast().setValue(Double.toString(value));
  }

  /**
   * Adds a {@link ChangeEvent} handler.
   * 
   * @param handler the change handler
   * @return {@link HandlerRegistration} used to remove this handler
   */
  @Override
  public HandlerRegistration addChangeHandler(ChangeHandler handler) {
    return addDomHandler(handler, ChangeEvent.getType());
  }
}
