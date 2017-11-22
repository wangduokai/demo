package com.yss.ms.auth.service;


import com.yss.ms.auth.vo.FrontUser;

public interface AuthService {
    String login(String username, String password) throws Exception;
    String refresh(String oldToken);
    void validate(String token) throws Exception;
    FrontUser getUserInfo(String token) throws Exception;
    Boolean invalid(String token);
}
