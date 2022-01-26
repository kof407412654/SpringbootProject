package com.lichengyu.springboot.service.impl;

import com.lichengyu.springboot.service.MyService;
import com.lichengyu.springboot.util.Constant;
import org.springframework.stereotype.Service;

@Service(value = "myService")
public class MyServiceImpl implements MyService {

    @Override
    public String returnStr() {
        return "Hello World!!!";
    }

}
