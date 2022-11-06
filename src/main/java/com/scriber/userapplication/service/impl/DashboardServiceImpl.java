package com.scriber.userapplication.service.impl;

import com.scriber.userapplication.dto.DocumentDetail;
import com.scriber.userapplication.dto.UserDetailDTO;
import com.scriber.userapplication.entity.Document;
import com.scriber.userapplication.entity.UserDetail;
import com.scriber.userapplication.formServiceUtil.entity.FormTemplate;
import com.scriber.userapplication.repository.DocumentRepository;
import com.scriber.userapplication.repository.UserDetailRepository;
import com.scriber.userapplication.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Slf4j
@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void createProfile(UserDetailDTO userDetail) {
        try {
            UserDetail newUserDetail = UserDetail.builder()
                    .email(userDetail.getEmail())
                    .address(userDetail.getAddress())
                    .userName(userDetail.getUserName())
                    .phoneNumber(userDetail.getPhoneNumber())
                    .build();
            userDetailRepository.save(newUserDetail);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public void addDocument(DocumentDetail documentDetail, UserDetail userDetail) {

        try {
            String documentReference = saveDocumentOnServer(documentDetail.getFile());
            Document newDocument = Document.builder()
                    .documentReference(documentReference)
                    .documentType(documentDetail.getDocumentType())
                    .build();
            userDetail.getDocuments().add(newDocument);

            userDetailRepository.save(userDetail);
            documentRepository.save(newDocument);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            throw ex;
        }
    }

    private String saveDocumentOnServer(MultipartFile file) {
        return "FILL IT UP";
    }

    @Override
    public List<Document> getDocuments(UserDetail userDetail) {
        List<Document> documents = documentRepository.findAllByUserDetails(userDetail);
        return documents;
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
