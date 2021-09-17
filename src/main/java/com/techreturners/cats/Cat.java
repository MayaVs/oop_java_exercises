package com.techreturners.cats;
import com.techreturners.Animal;

abstract class Cat implements Animal{
    protected int height;
    protected boolean sleepMode;
    protected String setting;

    public Cat(){}

    public abstract String eat();
    public void sleep(){}
    public void run(){}

    public void setHeight(int height){
        this.height = height;
    }
    public int getAverageHeight(){
        return this.height;
    }

    public void setSleepMode(boolean sleepMode){
        this.sleepMode = sleepMode;
    }

    public void setSetting(String setting){
        this.setting = setting;
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
