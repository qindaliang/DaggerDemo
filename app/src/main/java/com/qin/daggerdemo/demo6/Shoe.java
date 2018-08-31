package com.qin.daggerdemo.demo6;

import javax.inject.Inject;

public class Shoe {
    private String name;
    @Inject
    public Shoe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
