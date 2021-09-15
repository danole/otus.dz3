package com.frolov.dz3.classesOfAnimals;

public enum Commands {
    ADD("add"),
    LIST("list"),
    EXIT("exit"),
    DOG("dog"),
    DUCK("duck"),
    CAT("cat");

    private final String value;

    Commands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
