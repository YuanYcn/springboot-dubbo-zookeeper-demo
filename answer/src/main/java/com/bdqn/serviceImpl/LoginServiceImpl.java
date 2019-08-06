package com.bdqn.serviceImpl;

import com.bdqn.service.LoginService;

public class LoginServiceImpl implements LoginService {
    @Override
    public String sayHello() {
        return "hello dubbo";
    }
}
