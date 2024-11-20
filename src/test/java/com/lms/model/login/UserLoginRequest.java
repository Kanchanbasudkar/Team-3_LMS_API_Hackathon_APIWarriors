package com.lms.model.login;


import lombok.Data;

@Data
public class UserLoginRequest {

    String userLoginEmailId;
    String password;

}
