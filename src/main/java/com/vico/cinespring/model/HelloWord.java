package com.vico.cinespring.model;

public class HelloWord {
    private String value = "Hello World!";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}