package io.zipcoder.polymorphism;

public class Bird extends Pet {
    public Bird(String name) {
        super(name);

    }

    public String speak() {
        return "lala";
    }

    public String getType() {
        return "bird";
    }
}
