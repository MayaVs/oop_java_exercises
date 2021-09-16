package com.techreturners.cats;

public class CheetahCat extends Cat{

    public CheetahCat(){
        super.setHeight(1100);
        super.setSetting("wild");
        super.setSleepMode(false);
    }

    public String eat(){
        return "Zzzzzzz";
    }
}
