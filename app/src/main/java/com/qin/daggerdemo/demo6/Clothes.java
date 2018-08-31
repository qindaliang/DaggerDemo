package com.qin.daggerdemo.demo6;

public class Clothes {
    private Cloth mCloth;

    public Cloth getCloth() {
        return mCloth;
    }

    public void setCloth(Cloth cloth) {
        mCloth = cloth;
    }

    public Clothes(Cloth cloth) {
        mCloth = cloth;
    }

    @Override
    public String toString() {
        return getCloth().getColor()+"衣服";
    }
}
