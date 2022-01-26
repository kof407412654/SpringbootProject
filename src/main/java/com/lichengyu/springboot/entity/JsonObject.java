package com.lichengyu.springboot.entity;

import com.lichengyu.springboot.constant.GsonSingletonBuilder;

public class JsonObject {
    @Override
    public String toString() {
        return GsonSingletonBuilder.getGson().toJson(this);
    }
}
