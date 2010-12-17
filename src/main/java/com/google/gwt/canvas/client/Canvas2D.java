package com.google.gwt.canvas.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.media.client.VideoElement;

public class Canvas2D extends JavaScriptObject {
  protected Canvas2D() {
  }

  // back-reference to the canvas
  public final native CanvasElement getCanvas() /*-{
    return this.canvas;
  }-*/;

  // ===== state =====

  // push state on state stack
  /**
   * Each context maintains a stack of drawing states. Drawing states consist
   * of:
   * <ul>
   * <li>The current transformation matrix.</li>
   * <li>The current clipping region.</li>
   * <li>The current values of the following attributes:
   * <ul>
   * <li>strokeStyle</li>
   * <li>fillStyle</li>
   * <li>globalAlpha</li>
   * <li>lineWidth</li>
   * <li>lineCap</li>
   * <li>lineJoin</li>
   * <li>miterLimit</li>
   * <li>shadowOffsetX</li>
   * <li>shadowOffsetY</li>
   * <li>shadowBlur</li>
   * <li>shadowColor</li>
   * <li>globalCompositeOperation</li>
   * <li>font</li>
   * <li>textAlign</li>
   * <li>textBaseline</li>
   * </ul>
   * </ul>
   * <b>The current path and the current bitmap are not part of the drawing
   * state. The current path is persistent, and can only be reset using the
   * beginPath() method. The current bitmap is a property of the canvas, not the
   * context.</b>
   */
  public final native void save() /*-{
    this.save();
  }-*/;

  /**
   * Pops the state stack and restores the previous state. See
   * {@linkplain #save()}
   */
  public final native void restore() /*-{
    this.restore();
  }-*/;

  // ===== transformations =====
  // (default transform is the identity matrix)

  public final native void scale(double x, double y) /*-{
    this.scale(x, y);
  }-*/;

  public final native void rotate(double angle) /*-{
    this.rotate(angle);
  }-*/;

  public final native void translate(double x, double y) /*-{
    this.translate(x, y);
  }-*/;

  public final native void transform(double m11, double m12, double m21,
      double m22, double dx, double dy) /*-{
    this.transform(m11, m12, m21, m22, dx, dy);
  }-*/;

  public final native void setTransform(double m11, double m12, double m21,
      double m22, double dx, double dy) /*-{
    this.setTransform(m11, m12, m21, m22, dx, dy);
  }-*/;

  // ===== compositing =====

  public final native double getGlobalAlpha() /*-{
    return this.globalAlpha;
  }-*/;

  // (default 1.0)
  public final native void setGlobalAplha(double alpha) /*-{
    this.globalAlpha = alpha;
  }-*/;

  public final native String getGlobalCompositeOperation() /*-{
    return this.globalCompositeOperation;
  }-*/;

  /**
   * Sets the operation used for compositing. <code>operation</code> must be one
   * of:
   * <dl>
   * <dt>source-atop</dt>
   * <dd>A atop B. Display the source image wherever both images are opaque.
   * Display the destination image wherever the destination image is opaque but
   * the source image is transparent. Display transparency elsewhere.</dd>
   * <dt>source-in</dt>
   * <dd>A in B. Display the source image wherever both the source image and
   * destination image are opaque. Display transparency elsewhere.</dd>
   * <dt>source-out</dt>
   * <dd>A out B. Display the source image wherever the source image is opaque
   * and the destination image is transparent. Display transparency elsewhere.</dd>
   * <dt>source-over (default)</dt>
   * <dd>A over B. Display the source image wherever the source image is opaque.
   * Display the destination image elsewhere.</dd>
   * <dt>destination-atop</dt>
   * <dd>B atop A. Same as source-atop but using the destination image instead
   * of the source image and vice versa.</dd>
   * <dt>destination-in</dt>
   * <dd>B in A. Same as source-in but using the destination image instead of
   * the source image and vice versa.</dd>
   * <dt>destination-out</dt>
   * <dd>B out A. Same as source-out but using the destination image instead of
   * the source image and vice versa.</dd>
   * <dt>destination-over</dt>
   * <dd>B over A. Same as source-over but using the destination image instead
   * of the source image and vice versa.</dd>
   * <dt>lighter</dt>
   * <dd>A plus B. Display the sum of the source image and destination image,
   * with color values approaching 1 as a limit.</dd>
   * <dt>copy</dt>
   * <dd>A (B is ignored). Display the source image instead of the destination
   * image.</dd>
   * <dt>xor</dt>
   * <dd>A xor B. Exclusive OR of the source image and destination image.</dd>
   * </dl>
   * 
   * @param operation The compositing operation to use
   */
  // (default source-over)
  public final native void setGlobalCompositeOperation(String operation) /*-{
    this.globalCompositeOperation = operation;
  }-*/;

  // ===== colors and styles =====

  // (default black)
  public final native String getStrokeStyleCssColor() /*-{
    // TODO Type safety, type checking, etc
    return this.strokeStyle;
  }-*/;

  public final native CanvasGradient getStrokeStyleGradient() /*-{
    // TODO Type safety, type checking, etc
    return this.strokeStyle;
  }-*/;

  public final native CanvasPattern getStrokeStylePattern() /*-{
    // TODO Type safety, type checking, etc
    return this.strokeStyle;
  }-*/;

  public final native void setStrokeStyle(String cssColor) /*-{
    this.strokeStyle = cssColor;
  }-*/;

  public final native void setStrokeStyle(CanvasGradient gradient) /*-{
    this.strokeStyle = gradient;
  }-*/;

  public final native void setStrokeStyle(CanvasPattern pattern) /*-{
    this.strokeStyle = pattern;
  }-*/;

  // (default black)
  public final native String getFillStyleCssColor() /*-{
    // TODO Type safety, type checking, etc
    return this.fillStyle;
  }-*/;

  public final native CanvasGradient getFillStyleGradient() /*-{
    // TODO Type safety, type checking, etc
    return this.fillStyle;
  }-*/;

  public final native CanvasPattern getFillStylePattern() /*-{
    // TODO Type safety, type checking, etc
    return this.fillStyle;
  }-*/;

  public final native void setFillStyle(String cssColor) /*-{
    this.fillStyle = cssColor;
  }-*/;

  public final native void setFillStyle(CanvasGradient gradient) /*-{
    this.fillStyle = gradient;
  }-*/;

  public final native void setFillStyle(CanvasPattern pattern) /*-{
    this.fillStyle = pattern;
  }-*/;

  public final native CanvasGradient createLinearGradient(double x0, double y0,
      double x1, double y1) /*-{
    return this.createLinearGradient(x0, y0, x1, y1);
  }-*/;

  public final native CanvasGradient createRadialGradient(double x0, double y0,
      double r0, double x1, double y1, double r1) /*-{
    return this.createRadialGradient(x0, y0, r0, x1, y1, r1);
  }-*/;

  /**
   * Creates a pattern using an image
   * @param image The source image
   * @param repetition Repetition type, must be one of 'repeat', 'repeat-x',
   *          'repeat-y', 'no-repeat'
   * @return a new CanvasPattern instance
   */
  public native final CanvasPattern createPattern(ImageElement image,
      String repetition) /*-{
    return this.createPattern(image, repetition);
  }-*/;

  /**
   * Creates a pattern using a canvas as the source image.
   * 
   * @param canvas The source canvas
   * @param repetition Repetition type, must be one of 'repeat', 'repeat-x',
   *          'repeat-y', 'no-repeat'
   * @return a new CanvasPattern instance
   */
  public native final CanvasPattern createPattern(CanvasElement canvas,
      String repetition) /*-{
    return this.createPattern(canvas, repetition);
  }-*/;

  /**
   * Creates a pattern using the frame at the current playback position of the
   * video as the source image, and the source image's dimensions are the
   * intrinsic width and intrinsic height of the media resource (after any
   * aspect-ratio correction has been applied).
   * 
   * @param video The Video element used to create a pattern
   * @param repetition Repetition type, must be one of 'repeat', 'repeat-x',
   *          'repeat-y', 'no-repeat'
   * @return a new CanvasPattern instance
   */
  public native final CanvasPattern createPattern(VideoElement video,
      String repetition) /*-{
    return this.createPattern(video, repetition);
  }-*/;

  // ===== line caps/joins =====

  public native final double getLineWidth() /*-{
    return this.lineWidth;
  }-*/;

  // (default 1)
  public native final void setLineWidth(double lineWidth) /*-{
    this.lineWidth = lineWidth;
  }-*/;

  public native final String getLineCap() /*-{
    return this.lineCap;
  }-*/;

  // "butt", "round", "square" (default "butt")
  public native final void setLineCap(String lineCap) /*-{
    this.lineCap = lineCap;
  }-*/;

  public native final String getLineJoin() /*-{
    return this.lineJoin;
  }-*/;

  // "round", "bevel", "miter" (default "miter")
  public native final void setLineJoin(String lineJoin) /*-{
    this.lineJoin = lineJoin;
  }-*/;

  public native final double getMiterLimit() /*-{
    return this.miterLimit;
  }-*/;

  // (default 10)
  public native final void setMiterLimit(double miterLimit) /*-{
    this.miterLimit = miterLimit;
  }-*/;

  // ===== shadows ======

  public native final double getShadowOffsetX() /*-{
    return this.shadowOffsetX;
  }-*/;

  // (default 0)
  public native final void setShadowOffsetX(double shadowOffsetX) /*-{
    this.shadowOffsetX = shadowOffsetX;
  }-*/;

  public native final double getShadowOffsetY() /*-{
    return this.shadowOffsetY;
  }-*/;

  // (default 0)
  public native final void setShadowOffsetY(double shadowOffsetY) /*-{
    this.shadowOffsetY = shadowOffsetY;
  }-*/;

  public native final double getShadowBlur() /*-{
    return this.shadowBlur;
  }-*/;

  // (default 0)
  public native final void setShadowBlue(double shadowBlur) /*-{
    this.shadowBlur = shadowBlur;
  }-*/;

  public native final String getShadowColor() /*-{
    return this.shadowColor;
  }-*/;

  // (default transparent black)
  public native final void setShadowColor(String shadowColor) /*-{
    this.shadowColor = shadowColor;
  }-*/;

  // ===== rects =====

  public native final void clearRect(double x, double y, double w, double h) /*-{
    this.clearRect(x, y, w, h);
  }-*/;

  public native final void fillRect(double x, double y, double w, double h) /*-{
    this.fillRect(x, y, w, h);
  }-*/;

  public native final void strokeRect(double x, double y, double w, double h) /*-{
    this.strokeRect(x, y, w, h);
  }-*/;

  // ===== path API =====

  public native final void beginPath() /*-{
    this.beginPath();
  }-*/;

  public native final void closePath() /*-{
    this.closePath();
  }-*/;

  public native final void moveTo(double x, double y) /*-{
    this.moveTo(x, y);
  }-*/;

  public native final void lineTo(double x, double y) /*-{
    this.lineTo(x, y);
  }-*/;

  /**
   * Draws a quadratic curve
   * 
   * @param cpx control point X
   * @param cpy control point Y
   * @param x end X
   * @param y end Y
   */
  public native final void quadraticCurveTo(double cpx, double cpy, double x,
      double y) /*-{
    this.quadraticCurveTo(cpx, cpy, x, y);
  }-*/;

  /**
   * Draws a bezier curve
   * 
   * @param cp1x 1st control point X
   * @param cp1y 1st control point Y
   * @param cp2x 2nd control point X
   * @param cp2y 2nd control point Y
   * @param x end X
   * @param y end Y
   */
  public native final void bezierCurveTo(double cp1x, double cp1y, double cp2x,
      double cp2y, double x, double y) /*-{
    this.quadraticCurveTo(cp1x, cp1y, cp2x, cp2y, x, y);
  }-*/;

  public native final void arcTo(double x1, double y1, double x2, double y2,
      double radius) /*-{
    this.arcTo(x1, y1, x2, y2, radius);
  }-*/;

  public native final void rect(double x, double y, double w, double h) /*-{
    this.rect(x, y, w, h);
  }-*/;

  public native final void arc(double x, double y, double radius,
      double startAngle, double endAngle, boolean antiClockwise) /*-{
    this.arc(x, y, radius, startAngle, endAngle, antiClockwise);
  }-*/;

  public native final void fill() /*-{
    this.fill();
  }-*/;

  public native final void stroke() /*-{
    this.stroke();
  }-*/;

  public native final void clip() /*-{
    this.clip();
  }-*/;

  public native final boolean isPointInPath(double x, double y) /*-{

  }-*/;

  // ===== text =====

  public native final String getFont(String font) /*-{
    return this.font;
  }-*/;

  // (default 10px sans-serif)
  public native final void setFont(String font) /*-{
    this.font = font;
  }-*/;

  public native final String getTextAlign() /*-{
    return this.textAlign;
  }-*/;

  // "start", "end", "left", "right", "center" (default: "start")
  public native final void setTextAlign(String textAlign) /*-{
    this.textAlign = textAlign;
  }-*/;

  public native final String getTextBaseline() /*-{
    return this.textBaseline;
  }-*/;

  // "top", "hanging", "middle", "alphabetic", "ideographic", "bottom" (default:
  // "alphabetic")
  public native final void setTextBaseline(String textBaseline) /*-{
    this.textBaseline = textBaseline;
  }-*/;

  public native final void fillText(String text, double x, double y) /*-{
    this.fillText(text, x, y);
  }-*/;

  public native final void fillText(String text, double x, double y,
      double maxWidth) /*-{
    this.fillText(text, x, y, maxWidth);
  }-*/;

  public native final void strokeText(String text, double x, double y) /*-{
    this.strokeText(text, x, y);
  }-*/;

  public native final void strokeText(String text, double x, double y,
      double maxWidth) /*-{
    this.strokeText(text, x, y, maxWidth);
  }-*/;

  public native final TextMetrics meatureText(String text) /*-{
    return this.measureText(text);
  }-*/;

  // ===== drawing images =====

  public native final void drawImage(ImageElement imageElement, double dx,
      double dy) /*-{
    this.drawImage(imageElement, dx, dy);
  }-*/;

  public native final void drawImage(ImageElement imageElement, double dx,
      double dy, double dw, double dh) /*-{
    this.drawImage(imageElement, dx, dy, dw, dh);
  }-*/;

  public native final void drawImage(ImageElement imageElement, double sx,
      double sy, double sw, double sh, double dx, double dy, double dw,
      double dh) /*-{
    this.drawImage(imageElement, sx, sy, sw, sh, dx, dy, dw, dh);
  }-*/;

  public native final void drawImage(CanvasElement canvasElement, double dx,
      double dy) /*-{
    this.drawImage(canvasElement, dx, dy);
  }-*/;

  public native final void drawImage(CanvasElement canvasElement, double dx,
      double dy, double dw, double dh) /*-{
    this.drawImage(canvasElement, dx, dy, dw, dh);
  }-*/;

  public native final void drawImage(CanvasElement canvasElement, double sx,
      double sy, double sw, double sh, double dx, double dy, double dw,
      double dh) /*-{
    this.drawImage(canvasElement, sx, sy, sw, sh, dx, dy, dw, dh);
  }-*/;

  public native final void drawImage(VideoElement videoElement, double dx,
      double dy) /*-{
    this.drawImage(videoElement, dx, dy);
  }-*/;

  public native final void drawImage(VideoElement videoElement, double dx,
      double dy, double dw, double dh) /*-{
    this.drawImage(videoElement, dx, dy, dw, dh);
  }-*/;

  public native final void drawImage(VideoElement videoElement, double sx,
      double sy, double sw, double sh, double dx, double dy, double dw,
      double dh) /*-{
    this.drawImage(videoElement, sx, sy, sw, sh, dx, dy, dw, dh);
  }-*/;

  // ===== pixel manipulation ======

  public native final ImageData createImageData(double sw, double sh) /*-{
    return this.createImageData(sw, sh);
  }-*/;

  public native final ImageData createImageData(ImageData imageData) /*-{
    return this.createImageData(imageData);
  }-*/;

  public native final ImageData getImageData(double sx, double sy, double sw,
      double sh) /*-{
    return this.getImageData(sx, sy, sw, sh);
  }-*/;

  public native final void putImageData(ImageData imageData, double dx,
      double dy) /*-{
    this.putImageData(imageData, dx, dy);
  }-*/;

  public native final void putImageData(ImageData imageData, double dx,
      double dy, double dirtyX, double dirtyY, double dirtyWidth,
      double dirtyHeight) /*-{
    this.putImage(imageData, dx, dy, dirtyX, dirtyY, dirtyWidth, dirtyHeight);
  }-*/;
}
