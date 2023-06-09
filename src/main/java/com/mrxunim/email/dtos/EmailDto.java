package com.mrxunim.email.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private List<String> emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

}
