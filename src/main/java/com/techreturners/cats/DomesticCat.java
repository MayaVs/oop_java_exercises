package com.techreturners.cats;

import java.util.Random;

class DomesticCat extends Cat{
    private Random random;

    public DomesticCat(){
        super(23, false, "domestic");
        this.random = new Random();
    }

    public void setRandom(Random random){
        this.random = random;
    }

    public String eat(){
        String reaction = "Purrrrrrr";
        int check = this.random.nextInt();
        if( check % 2 == 0 ) reaction += "\nIt will do I suppose";
        return reaction;
  }
}
