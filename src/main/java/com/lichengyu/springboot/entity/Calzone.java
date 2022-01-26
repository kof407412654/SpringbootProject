package com.lichengyu.springboot.entity;

public class Calzone extends Pizza{
    private final Boolean sauceInside;

    public static class CalzoneBuilder extends Pizza.Builder<CalzoneBuilder>{
        private Boolean sauceInside=false;

        public CalzoneBuilder putSauceInside(){
            sauceInside=true;
            return this;
        }

        @Override
        protected CalzoneBuilder self() {
            return this;
        }

        @Override
        public Pizza build() {
            return new Calzone(this);
        }
    }

    private Calzone(CalzoneBuilder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
