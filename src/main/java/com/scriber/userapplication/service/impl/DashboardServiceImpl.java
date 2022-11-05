package com.scriber.userapplication.service.impl;

import com.scriber.userapplication.dto.DocumentDetail;
import com.scriber.userapplication.dto.UserDetailDTO;
import com.scriber.userapplication.entity.Document;
import com.scriber.userapplication.entity.UserDetail;
import com.scriber.userapplication.formServiceUtil.entity.FormTemplate;
import com.scriber.userapplication.service.DashboardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Override
    public void createProfile(UserDetailDTO userDetail) {

    }

    @Override
    public void addDocument(DocumentDetail documentDetail, UserDetail userDetail) {

    }

    @Override
    public List<Document> getDocuments(UserDetail userDetail) {
        return null;
    }

    @Override
    public boolean updateDocument(DocumentDetail documentDetail, UserDetail userDetail) {
        return false;
    }

    @Override
    public List<FormTemplate> getSupportedDocuments() {
        return null;
    }

    @Override
    public List<String> getDocumentTypes() {
        return null;
    }
}
