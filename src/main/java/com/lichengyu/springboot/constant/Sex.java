package com.lichengyu.springboot.constant;

public enum Sex {
    FEMAIL("女"),MAIL("男");
    public final String sexType;
    Sex(String sexType){
        this.sexType = sexType;
    }
}
