package com.lichengyu.springboot.entity;

import java.util.Objects;

public class NYPizza extends Pizza{
    public enum Size{SMALL,MEDIUM,LARGE}
    private final Size size;

    public static class NYBuilder extends Pizza.Builder<NYBuilder>{
        private final Size size;

        public NYBuilder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected NYBuilder self() {
            return this;
        }

        @Override
        public Pizza build() {
            return new NYPizza(this);
        }
    }

    private NYPizza(NYBuilder builder) {
        super(builder);
        this.size = builder.size;
    }
}
