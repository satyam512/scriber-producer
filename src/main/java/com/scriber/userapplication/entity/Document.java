package com.scriber.userapplication.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Document {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;
}
