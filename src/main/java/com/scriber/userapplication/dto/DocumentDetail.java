package com.scriber.userapplication.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class DocumentDetail {
    private String documentType;
    private MultipartFile file;
}
