package com.scriber.userapplication.formServiceUtil.entity;

import lombok.Data;

@Data
public class Field<T> {
    private T content;
    private String label;
}
