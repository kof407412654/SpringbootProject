package com.lichengyu.springboot.entity;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza extends JsonObject{

    public enum Topping{HAM,MUSHROOM,ONION}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        protected abstract T self();
        public abstract Pizza build();
    }

    Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }
}
