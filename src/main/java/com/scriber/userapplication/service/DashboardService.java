package com.scriber.userapplication.service;

import com.scriber.userapplication.dto.DocumentDetail;
import com.scriber.userapplication.dto.UserDetailDTO;
import com.scriber.userapplication.entity.Document;
import com.scriber.userapplication.entity.UserDetail;
import com.scriber.userapplication.formServiceUtil.entity.DocumentTemplate;

import java.util.List;

public interface DashboardService {
    void createProfile(UserDetailDTO userDetail);
    void addDocument(DocumentDetail documentDetail, UserDetail userDetail);

    List<Document> getDocuments(UserDetail userDetail);

    boolean updateDocument(DocumentDetail documentDetail, UserDetail userDetail);

    List<DocumentTemplate> getSupportedDocuments();

    List<String> getDocumentTypes();
}
