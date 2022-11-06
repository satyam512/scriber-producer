package com.scriber.userapplication.formServiceUtil.entity;

import lombok.Data;

import java.util.List;

@Data
public class FormTemplate {
    private String formName;
    private String termsAndConditions;
    private List<Field> fields;
}
