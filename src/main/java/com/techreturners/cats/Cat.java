package com.techreturners.cats;
import com.techreturners.Animal;

abstract class Cat implements Animal{
    protected int height;
    protected boolean sleepMode;
    protected String setting;

    public Cat(int height, boolean sleepMode, String setting){
        this.height = height;
        this.sleepMode = sleepMode;
        this.setting = setting;
    }

    public abstract String eat();
    public void sleep(){}
    public void run(){}

    public int getAverageHeight(){
        return this.height;
    }

    public String getSetting(){
        return this.setting;
    }

    public boolean isAsleep(){
        return this.sleepMode;
    }

    public void goToSleep(){
        this.sleepMode = true;
    }

    public void wakeUp(){
        this.sleepMode = false;
    }
}
