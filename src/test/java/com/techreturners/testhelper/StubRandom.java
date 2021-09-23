package com.techreturners.testhelper;

import java.util.Random;

public class StubRandom extends Random {
    private int value;
    public StubRandom(int value){
        this.value = value;
    }

    @Override
    public int nextInt(){
        return this.value;
    }
}
