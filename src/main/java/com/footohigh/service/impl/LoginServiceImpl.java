package com.footohigh.service.impl;

import com.footohigh.domain.ResponseResult;
import com.footohigh.domain.User;
import com.footohigh.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AuthenticationManager authenticationManager;


    @Override
    public ResponseResult login(User user) {

        //authenticationManager.authenticate();

        return null;
    }
}
