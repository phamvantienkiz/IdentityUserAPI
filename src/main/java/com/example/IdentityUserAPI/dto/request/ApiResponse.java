package com.example.IdentityUserAPI.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL) //Xoa message neu message = null
public class ApiResponse <T>{
    private int code;
    private String message;
    private T result;
}
