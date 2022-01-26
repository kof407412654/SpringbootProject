package com.lichengyu.springboot.constant;

import com.google.gson.Gson;

public abstract class GsonSingletonBuilder {
    public static Gson getGson(){
        return Builder.gson;
    }
    static class Builder{
        private static final Gson gson=new Gson();
    }
}
