package com.hangyasi.todoserver.utility;

public enum ItemType {

  TODO(1),
  IN_PROGRESS(2),
  DONE(3);

  private final int typeCode;

  ItemType(int typeCode) {
    this.typeCode = typeCode;
  }


}
