package com.qin.daggerdemo.demo6;

public class ClothesHolder {
    public Clothes createClothes(Cloth cloth){
        return new Clothes(cloth);
    }
}
