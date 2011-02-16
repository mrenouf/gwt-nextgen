package com.bitgrind.gwt.nextgen.testapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.Document;
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
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

public class TestApp implements EntryPoint {

  static void assertEquals(double a, double b) {
    String method = new Exception().fillInStackTrace().getStackTrace()[1].getMethodName();
    Element div = DOM.createDiv();
    if (a == b) {
      div.setInnerHTML(method + ": <b>PASS</b>");
      div.getStyle().setColor("green");
    } else {
      div.setInnerHTML(method + ": <b>FAIL</b> (expected: " + a + ", got: " + b + ")");
      div.getStyle().setColor("red");
    }
    Document.get().getBody().appendChild(div);
  }

  @Override
  public void onModuleLoad() {
    testArrayBuffer();
    testInt16Array();
    testInt32Array();
    testInt8Array();
    testUint16Array();
    testUint32Array();
    testUint8Array();
    testFloat32Array();
    //testFoat64Array();
  }

  public JsArrayNumber createArrayOf25() {
    JsArrayNumber jsArray25 = JavaScriptObject.createArray().cast();
    for (int i=0; i<25; i++) {
      jsArray25.set(i, i);
    }
    return jsArray25;
  }

  public void testArrayBuffer() {
    ArrayBuffer buffer = ArrayBuffer.create(100);
    assertEquals(100, buffer.getByteLength());
  }

  public void testTypedArray(int size, int bytesPerElement, TypedArray typed) {
    assertEquals(size, typed.getLength());
    assertEquals(bytesPerElement * size, typed.getBuffer().getByteLength());
    assertEquals(bytesPerElement * size, typed.getByteLength());
  }

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
    buffer.set(jsArray25, 12);
    for (int i=0; i<12; i++) {
      assertEquals(i, buffer.get(i));
    }
    for (int i=0; i<13; i++) {
      assertEquals(i, buffer.get(i+12));
    }
  }

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
    buffer.set(jsArray25, 12);
    for (int i=0; i<12; i++) {
      assertEquals(i, buffer.get(i));
    }
    for (int i=0; i<13; i++) {
      assertEquals(i, buffer.get(i+12));
    }
  }

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
    buffer.set(jsArray25, 12);
    for (int i=0; i<12; i++) {
      assertEquals(i, buffer.get(i));
    }
    for (int i=0; i<13; i++) {
      assertEquals(i, buffer.get(i+12));
    }
  }

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
    buffer.set(jsArray25, 12);
    for (int i=0; i<12; i++) {
      assertEquals(i, buffer.get(i));
    }
    for (int i=0; i<13; i++) {
      assertEquals(i, buffer.get(i+12));
    }
  }

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
    buffer.set(jsArray25, 12);
    for (int i=0; i<12; i++) {
      assertEquals(i, buffer.get(i));
    }
    for (int i=0; i<13; i++) {
      assertEquals(i, buffer.get(i+12));
    }
  }

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
    buffer.set(jsArray25, 12);
    for (int i=0; i<12; i++) {
      assertEquals(i, buffer.get(i));
    }
    for (int i=0; i<13; i++) {
      assertEquals(i, buffer.get(i+12));
    }
  }

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
    buffer.set(jsArray25, 12);
    for (int i=0; i<12; i++) {
      assertEquals(i, buffer.get(i));
    }
    for (int i=0; i<13; i++) {
      assertEquals(i, buffer.get(i+12));
    }
  }

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
    buffer.set(jsArray25, 12);
    for (int i=0; i<12; i++) {
      assertEquals(i, buffer.get(i));
    }
    for (int i=0; i<13; i++) {
      assertEquals(i, buffer.get(i+12));
    }
  }
}
