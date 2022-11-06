package com.scriber.userapplication.service;

import com.scriber.userapplication.entity.Document;
import com.scriber.userapplication.entity.UserDetail;
import com.scriber.userapplication.formServiceUtil.entity.FormApplication;

import java.util.List;

public interface FormManagementService {
    void submitForm(FormApplication requestForm); // Rabbit values

    List<FormApplication> getSubmittedForms(UserDetail userDetail);

    FormApplication getSubmittedFormStatus(Long applicationID);

    /**
     * Calls to FormManager to get result Document // E - Copy
     * @param applicationID
     * @return
     */
    Document getGeneratedDocument(Long applicationID);
}
