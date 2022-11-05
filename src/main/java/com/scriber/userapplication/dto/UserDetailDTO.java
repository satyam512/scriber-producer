package com.scriber.userapplication.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDetailDTO {
    private String userName;
    private String email;
    private String phoneNumber;
    private String address;
}
