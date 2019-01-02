package com.soyoung.cloud.dubbo.service.impl;

import com.soyoung.cloud.dubbo.service.SampleService;

public class SampleServiceImpl implements SampleService {

    @Override
    public String sayHello(String name) {
        return "hello,"+ name;
    }
}
