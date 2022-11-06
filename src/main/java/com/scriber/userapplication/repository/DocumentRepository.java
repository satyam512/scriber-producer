package com.scriber.userapplication.repository;

import com.scriber.userapplication.entity.Document;
import com.scriber.userapplication.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findAllByUserDetails(UserDetail userDetail);
}
