package com.scriber.userapplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String userName;
    private String email;
    private String phoneNumber;
    private String address;

    @JsonIgnore
    @OneToMany
    private List<Document> documents;
}
