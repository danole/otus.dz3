package com.frolov.dz3.classesOfAnimals;

public class Duck extends Animal implements Flying {

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }

}
