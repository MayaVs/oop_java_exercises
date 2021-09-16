package com.techreturners.cats;

public class LionCat extends Cat{

    public LionCat(){
        super.setHeight(1100);
        super.setSetting("wild");
        super.setSleepMode(false);
    }

    public String eat(){
        return "Roar!!!!";
    }
}
