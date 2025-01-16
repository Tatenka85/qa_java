package com.example;


import java.util.List;


public class Lion {


    private final boolean hasMane;
    private final Feline feline;


    // Конструктор с инъекцией зависимости
    public Lion(Predator predator, String sex) throws Exception {
        this.feline = (Feline) predator;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else throw new Exception("Используйте допустимые значения пола животного - самец или самка");
    }


    public int getKittens() {
        return feline.getKittens();
    }


    public boolean doesHaveMane() {
        return hasMane;
    }


    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
