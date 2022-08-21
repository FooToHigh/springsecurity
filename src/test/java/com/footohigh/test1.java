package com.footohigh;

import com.footohigh.config.SecurityConfig;
import com.footohigh.domain.User;
import com.footohigh.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Slf4j
public class test1 {
    @Resource
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
    @Resource
    private SecurityConfig securityConfig;

    @Test
    public void test2(){
        PasswordEncoder passwordEncoder = securityConfig.passwordEncoder();
        String encode = passwordEncoder.encode("12345");
        log.info(encode);
    }
}
