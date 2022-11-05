package com.scriber.userapplication.service;

import com.scriber.userapplication.entity.UserDetail;
import com.scriber.userapplication.formServiceUtil.entity.FormApplication;
import com.scriber.userapplication.formServiceUtil.entity.FormTemplate;

import java.util.List;

public interface FormManagementService {
    void submitForm(FormApplication requestForm); // Rabbit values

    List<FormApplication> getSubmittedForms(UserDetail userDetail);

    FormApplication getSubmittedFormStatus(Long applicationID);
}
