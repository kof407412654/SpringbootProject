package com.lichengyu.springboot.entity;

import com.lichengyu.springboot.constant.Sex;

public class Person extends JsonObject{
    private java.lang.String name;
    private String sex;
    private Byte age;
    private Person(Builder builder){
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
    }
    public static class Builder{
        //required param
        private String name;
        //optional param
        private String sex;
        private Byte age = 0;

        public Builder setSex(Sex sex) {
            this.sex = sex.sexType;
            return this;
        }
        public Builder setAge(Byte age) {
            this.age = age;
            return this;
        }
        public Person build(String name){
            this.name = name;
            return new Person(this);
        }
    }
}
