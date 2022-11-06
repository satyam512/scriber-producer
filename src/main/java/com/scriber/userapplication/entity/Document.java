package com.scriber.userapplication.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    UserDetail userDetail;

    String documentType;
    String documentReference; // a reference to generated document
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;
}
