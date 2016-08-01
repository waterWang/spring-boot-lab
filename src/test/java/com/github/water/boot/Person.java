package com.github.water.boot;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String greet(String yourName) {
        return String.format("Hi %s, my name is %s", name, yourName);
    }
}
