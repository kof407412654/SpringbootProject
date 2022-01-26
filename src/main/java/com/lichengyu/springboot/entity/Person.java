package com.lichengyu.springboot.entity;

import com.lichengyu.springboot.constant.Sex;

public class Person extends JsonObject{
    private String name;
    private Sex sex;
    private Byte age;
    private Person(Builder builder){
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
    }
    public static class Builder{
        private String name;
        private Sex sex;
        private Byte age;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setSex(Sex sex) {
            this.sex = sex;
            return this;
        }
        public Builder setAge(Byte age) {
            this.age = age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
