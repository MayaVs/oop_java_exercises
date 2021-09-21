package com.techreturners.cats;
import java.util.Random;

class DomesticCat extends Cat{

    public DomesticCat(){
        super(23, false, "domestic");
    }

    public String eat(){
        String reaction = "Purrrrrrr";
        Random random = new Random();
        if(random.nextInt() % 2 == 0 ) reaction += "\nIt will do I suppose";
        return reaction;
  }
}
