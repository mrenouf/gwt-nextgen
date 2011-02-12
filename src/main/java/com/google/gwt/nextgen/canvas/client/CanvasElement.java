package com.google.gwt.nextgen.canvas.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.TagName;
import com.google.gwt.user.client.Element;

/**
 * An HTML Canvas element <a
 * href="http://dev.w3.org/html5/spec/the-canvas-element.html">W3C</a> and <a
 * href= "http://www.whatwg.org/specs/web-apps/current-work/#the-canvas-element"
 * >WHATWG</a>
 */
@TagName("canvas")
public final class CanvasElement extends Element {

	public static CanvasElement create() {
		CanvasElement e = Document.get().createElement("canvas")
				.<CanvasElement> cast();
		return e;
	}

	protected CanvasElement() {
	}

	public native Canvas2D get2DContext() /*-{
											return this.getContext('2d');
											}-*/;

	public native int getWidth() /*-{
									return this.getAttribute('width') || 0;
									}-*/;

	public native void setWidth(int width) /*-{
											this.setAttribute('width', min);
											}-*/;

	public native int getHeight() /*-{
									return this.getAttribute('height') || 0;
									}-*/;

	public native void setHeight(int height) /*-{
												this.setAttribute('height', height);
												}-*/;

	public native String toDataURL() /*-{
										return this.toDataURL();
										}-*/;
}
