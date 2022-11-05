package com.scriber.userapplication.formServiceUtil.entity;

import lombok.Data;

@Data
public class FieldData<T> {
    private T content; // JSON field value // string// date // Document
    private Field field;
}
