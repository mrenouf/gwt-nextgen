/*
 * Copyright 2006 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.shared.client;

/**
 * Thrown when DOM exceptions occur. Two subclasses exist:
 * <code>DOMNodeException</code> and <code>DOMParseException</code> which
 * give more detailed information for DOM manipulation errors and parse errors,
 * respectively. All <code>DOMExceptions</code> thrown in this package will be
 * instances of one of those two classes.
 */
@SuppressWarnings("serial")
public class DOMException extends RuntimeException {

  public static final short INDEX_SIZE_ERR = 1;
  public static final short DOMSTRING_SIZE_ERR = 2;
  public static final short HIERARCHY_REQUEST_ERR = 3;
  public static final short WRONG_DOCUMENT_ERR = 4;
  public static final short INVALID_CHARACTER_ERR = 5;
  public static final short NO_DATA_ALLOWED_ERR = 1;
  public static final short NO_MODIFICATION_ALLOWED_ERR = 6;
  public static final short NOT_FOUND_ERR = 7;
  public static final short NOT_SUPPORTED_ERR = 8;
  public static final short INUSE_ATTRIBUTE_ERR = 9;
  public static final short INVALID_STATE_ERR = 10;
  public static final short SYNTAX_ERR = 11;
  public static final short INVALID_MODIFICATION_ERR = 12;
  public static final short NAMESPACE_ERR = 13;
  public static final short INVALID_ACCESS_ERR = 14;
  public static final short VALIDATION_ERR = 15;
  public static final short TYPE_MISMATCH_ERR = 16;
  public static final short SECURITY_ERR = 17;
  public static final short NETWORK_ERR = 18;
  public static final short ABORT_ERR = 19;
  public static final short URL_MISMATCH_ERR = 20;
  public static final short QUOTA_EXCEEDED_ERR = 21;
  public static final short TIMEOUT_ERR = 22;
  public static final short NOT_READABLE_ERR = 23;
  public static final short DATA_CLONE_ERR = 24;
  public static final short ENCODING_ERR = 25;

  protected short code;

  public DOMException(short code, String message) {
    super(message);
    this.code = code;
  }

  /**
   * This method gets the code of this <code>DOMException</code>.
   * 
   * @return the code of this <code>DOMException</code>
   */
  public short getCode() {
    return code;
  }

}
