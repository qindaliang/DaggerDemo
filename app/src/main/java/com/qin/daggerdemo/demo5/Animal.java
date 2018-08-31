package com.qin.daggerdemo.demo5;

import com.orhanobut.logger.Logger;

public class Animal {

    private Cat mCat;

    public Animal(Cat cat) {
        this.mCat = cat;
    }

    public String show(){
        return mCat.toString()+"come from animal.class";
    }
}
