package com.google.gwt.nextgen.client;

import org.junit.Test;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.nextgen.typedarrays.client.ArrayBuffer;
import com.google.gwt.nextgen.typedarrays.client.Float32Array;
import com.google.gwt.nextgen.typedarrays.client.Float64Array;
import com.google.gwt.nextgen.typedarrays.client.Int16Array;
import com.google.gwt.nextgen.typedarrays.client.Int32Array;
import com.google.gwt.nextgen.typedarrays.client.Int8Array;
import com.google.gwt.nextgen.typedarrays.client.TypedArray;
import com.google.gwt.nextgen.typedarrays.client.Uint16Array;
import com.google.gwt.nextgen.typedarrays.client.Uint32Array;
import com.google.gwt.nextgen.typedarrays.client.Uint8Array;

public class TypedArrayTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "com.google.gwt.nextgen.TestCases";
  }

  public JsArrayNumber createArrayOf25() {
    JsArrayNumber jsArray25 = JavaScriptObject.createArray().cast();
    for (int i=0; i<25; i++) {
      jsArray25.set(i, i);
    }
    return jsArray25;
  }

  @Test
  public void testArrayBuffer() {
    ArrayBuffer buffer = ArrayBuffer.create(100);
    assertEquals(100, buffer.getByteLength());
  }

  @Test
  public void testTypedArray(int size, int bytesPerElement, TypedArray typed) {
    assertEquals(size, typed.getLength());
    assertEquals(bytesPerElement * size, typed.getBuffer().getByteLength());
    assertEquals(bytesPerElement * size, typed.getByteLength());
  }

  @Test
  public void testInt8Array() {
    Int8Array buffer = Int8Array.create(100);
    assertEquals(100, buffer.getLength());
    assertEquals(Int8Array.BYTES_PER_ELEMENT * 100, buffer.getByteLength());
    assertEquals(Int8Array.BYTES_PER_ELEMENT * 100, buffer.getBuffer().getByteLength());
    JsArrayNumber jsArray25 = createArrayOf25();
    buffer.set(jsArray25);
    for (int i=0; i<25; i++) {
      assertEquals(i, buffer.get(i));
    }
    buffer.set(jsArray25, 23);
    for (int i=0; i<25; i++) {
      assertEquals(i+23, buffer.get(i));
    }
  }

  @Test
  public void testUint8Array() {
    Uint8Array buffer = Uint8Array.create(100);
    assertEquals(100, buffer.getLength());
    assertEquals(Uint8Array.BYTES_PER_ELEMENT * 100, buffer.getByteLength());
    assertEquals(Uint8Array.BYTES_PER_ELEMENT * 100, buffer.getBuffer().getByteLength());
    JsArrayNumber jsArray25 = createArrayOf25();
    buffer.set(jsArray25);
    for (int i=0; i<25; i++) {
      assertEquals(i, buffer.get(i));
    }
    buffer.set(jsArray25, 23);
    for (int i=0; i<25; i++) {
      assertEquals(i+23, buffer.get(i));
    }
  }

  @Test
  public void testInt16Array() {
    Int16Array buffer = Int16Array.create(100);
    assertEquals(100, buffer.getLength());
    assertEquals(Int16Array.BYTES_PER_ELEMENT * 100, buffer.getByteLength());
    assertEquals(Int16Array.BYTES_PER_ELEMENT * 100, buffer.getBuffer().getByteLength());
    JsArrayNumber jsArray25 = createArrayOf25();
    buffer.set(jsArray25);
    for (int i=0; i<25; i++) {
      assertEquals(i, buffer.get(i));
    }
    buffer.set(jsArray25, 23);
    for (int i=0; i<25; i++) {
      assertEquals(i+23, buffer.get(i));
    }
  }

  @Test
  public void testUint16Array() {
    Uint16Array buffer = Uint16Array.create(100);
    assertEquals(100, buffer.getLength());
    assertEquals(Uint16Array.BYTES_PER_ELEMENT * 100, buffer.getByteLength());
    assertEquals(Uint16Array.BYTES_PER_ELEMENT * 100, buffer.getBuffer().getByteLength());
    JsArrayNumber jsArray25 = createArrayOf25();
    buffer.set(jsArray25);
    for (int i=0; i<25; i++) {
      assertEquals(i, buffer.get(i));
    }
    buffer.set(jsArray25, 23);
    for (int i=0; i<25; i++) {
      assertEquals(i+23, buffer.get(i));
    }
  }

  @Test
  public void testInt32Array() {
    Int32Array buffer = Int32Array.create(100);
    assertEquals(100, buffer.getLength());
    assertEquals(Int32Array.BYTES_PER_ELEMENT * 100, buffer.getByteLength());
    assertEquals(Int32Array.BYTES_PER_ELEMENT * 100, buffer.getBuffer().getByteLength());
    JsArrayNumber jsArray25 = createArrayOf25();
    buffer.set(jsArray25);
    for (int i=0; i<25; i++) {
      assertEquals(i, buffer.get(i));
    }
    buffer.set(jsArray25, 23);
    for (int i=0; i<25; i++) {
      assertEquals(i+23, buffer.get(i));
    }
  }

  @Test
  public void testUint32Array() {
    Uint32Array buffer = Uint32Array.create(100);
    assertEquals(100, buffer.getLength());
    assertEquals(Uint32Array.BYTES_PER_ELEMENT * 100, buffer.getByteLength());
    assertEquals(Uint32Array.BYTES_PER_ELEMENT * 100, buffer.getBuffer().getByteLength());
    JsArrayNumber jsArray25 = createArrayOf25();
    buffer.set(jsArray25);
    for (int i=0; i<25; i++) {
      assertEquals(i, buffer.get(i));
    }
    buffer.set(jsArray25, 23);
    for (int i=0; i<25; i++) {
      assertEquals(i+23, buffer.get(i));
    }
  }

  @Test
  public void testFloat32Array() {
    Float32Array buffer = Float32Array.create(100);
    assertEquals(100, buffer.getLength());
    assertEquals(Float32Array.BYTES_PER_ELEMENT * 100, buffer.getByteLength());
    assertEquals(Float32Array.BYTES_PER_ELEMENT * 100, buffer.getBuffer().getByteLength());
    JsArrayNumber jsArray25 = createArrayOf25();
    buffer.set(jsArray25);
    for (int i=0; i<25; i++) {
      assertEquals(i, buffer.get(i));
    }
    buffer.set(jsArray25, 23);
    for (int i=0; i<25; i++) {
      assertEquals(i+23, buffer.get(i));
    }
  }

  @Test
  public void testFoat64Array() {
    Float64Array buffer = Float64Array.create(100);
    assertEquals(100, buffer.getLength());
    assertEquals(Float64Array.BYTES_PER_ELEMENT * 100, buffer.getByteLength());
    assertEquals(Float64Array.BYTES_PER_ELEMENT * 100, buffer.getBuffer().getByteLength());
    JsArrayNumber jsArray25 = createArrayOf25();
    buffer.set(jsArray25);
    for (int i=0; i<25; i++) {
      assertEquals(i, buffer.get(i));
    }
    buffer.set(jsArray25, 23);
    for (int i=0; i<25; i++) {
      assertEquals(i+23, buffer.get(i));
    }
  }
}
