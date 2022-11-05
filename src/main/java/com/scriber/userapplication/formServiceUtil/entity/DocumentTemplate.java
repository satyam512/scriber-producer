package com.scriber.userapplication.formServiceUtil.entity;

import lombok.Data;

import java.util.List;

@Data
public class DocumentTemplate {
    private String documentName;
    private List<Field> fields;
}
