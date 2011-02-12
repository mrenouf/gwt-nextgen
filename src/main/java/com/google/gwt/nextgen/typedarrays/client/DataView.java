package com.google.gwt.nextgen.typedarrays.client;


public final class DataView extends ArrayBufferView {
  protected DataView() {}

  public static native DataView of(ArrayBuffer buffer) /*-{
    return new DataView(buffer);
  }-*/;

  public static native DataView of(ArrayBuffer buffer, double offset) /*-{
    return new DataView(buffer, offset);
  }-*/;

  public static native DataView of(ArrayBuffer buffer, double offset, double length) /*-{
    return new DataView(buffer, offset, length);
  }-*/;

  public final native byte getInt8(double byteOffset) /*-{
    return this.getInt8(byteOffset);
  }-*/;

  public final native short getUint8(double byteOffset) /*-{
    return this.getInt8(byteOffset);
  }-*/;

  public final native short getInt16(double byteOffset) /*-{
    return this.getInt16(byteOffset);
  }-*/;

  public final native short getInt16(double byteOffset, boolean littleEndian) /*-{
    return this.getInt16(byteOffset, littleEndian);
  }-*/;

  public final native int getUint16(double byteOffset) /*-{
    return this.getUint16(byteOffset);
  }-*/;

  public final native int getUint16(double byteOffset, boolean littleEndian) /*-{
    return this.getUint16(byteOffset, littleEndian);
  }-*/;

  public final native int getInt32(double byteOffset) /*-{
    return this.getInt32(byteOffset);
  }-*/;

  public final native int getInt32(double byteOffset, boolean littleEndian) /*-{
    return this.getInt32(byteOffset, littleEndian);
  }-*/;

  public final native double getUint32(double byteOffset) /*-{
    return this.getUint32(byteOffset);
  }-*/;

  public final native double getUint32(double byteOffset, boolean littleEndian) /*-{
    return this.getUint32(byteOffset, littleEndian);
  }-*/;

  public final native float getFloat32(double byteOffset) /*-{
    return this.getFloat32(byteOffset);
  }-*/;

  public final native float getFloat32(double byteOffset, boolean littleEndian) /*-{
    return this.getFloat32(byteOffset, littleEndian);
  }-*/;

  public final native double getFloat64(double byteOffset) /*-{
    return this.getFloat64(byteOffset);
  }-*/;

  public final native double getFloat64(double byteOffset, boolean littleEndian) /*-{
    return this.getFloat64(byteOffset, littleEndian);
  }-*/;

  public final native void setInt8(double byteOffset, byte value) /*-{
    return this.setInt8(byteOffset, value);
  }-*/;

  public final native void setUint8(double byteOffset, short value) /*-{
    return this.setUint8(byteOffset, value);
  }-*/;

  public final native void setInt16(double byteOffset, short value) /*-{
    return this.setInt16(byteOffset, value);
  }-*/;

  public final native void setInt16(double byteOffset, short value, boolean littleEndian) /*-{
    return this.setInt16(byteOffset, value, littleEndian);
  }-*/;

  public final native void setUint16(double byteOffset, int value) /*-{
    return this.setUint16(byteOffset, value);
  }-*/;

  public final native void setUint16(double byteOffset, int value, boolean littleEndian) /*-{
    return this.setUint16(byteOffset, value, littleEndian);
  }-*/;

  public final native void setInt32(double byteOffset, int value) /*-{
    return this.setInt32(byteOffset, value);
  }-*/;

  public final native void setInt32(double byteOffset, int value, boolean littleEndian) /*-{
    return this.setInt32(byteOffset, value, littleEndian);
  }-*/;

  public final native void setUint32(double byteOffset, double value) /*-{
    return this.setUint32(byteOffset, value);
  }-*/;

  public final native void setUint32(double byteOffset, double value, boolean littleEndian) /*-{
    return this.setUint32(byteOffset, value, littleEndian);
  }-*/;

  public final native void setFloat32(double byteOffset, float value) /*-{
    return this.setFloat32(byteOffset, value);
  }-*/;

  public final native void setFloat32(double byteOffset, float value, boolean littleEndian) /*-{
    return this.setFloat32(byteOffset, value, littleEndian);
  }-*/;

  public final native void setFloat64(double byteOffset, double value) /*-{
    return this.setFloat64(byteOffset, value);
  }-*/;

  public final native void setFloat64(double byteOffset, double value, boolean littleEndian) /*-{
    return this.setFloat64(byteOffset, value, littleEndian);
  }-*/;
}
