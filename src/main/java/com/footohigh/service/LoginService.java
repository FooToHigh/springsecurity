package com.footohigh.service;

import com.footohigh.domain.ResponseResult;
import com.footohigh.domain.User;

public interface LoginService {
    ResponseResult login(User user);

}
