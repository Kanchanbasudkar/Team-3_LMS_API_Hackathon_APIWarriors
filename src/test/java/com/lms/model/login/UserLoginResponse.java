package com.lms.model.login;

import lombok.Data;

@Data
public class UserLoginResponse {
    String token;
    String type;
    String userId;
    String email;
    String[] roles;
    String status;
    Boolean passwordExpired;
}