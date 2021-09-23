package com.techreturners.cats;

import org.junit.Test;
import com.techreturners.testhelper.*;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat();
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCatOdd() {
        DomesticCat domesticCat = new DomesticCat();
        StubRandom stub = new StubRandom(5);
        domesticCat.setRandom(stub);

        String reply = domesticCat.eat();
        assertEquals("Purrrrrrr", reply);
    }

    @Test
    public void feedTheCatEven() {
        DomesticCat domesticCat = new DomesticCat();
        StubRandom stub = new StubRandom(6);
        domesticCat.setRandom(stub);

        String reply = domesticCat.eat();
        assertEquals("Purrrrrrr\n" +
                "It will do I suppose", reply);
    }
}
