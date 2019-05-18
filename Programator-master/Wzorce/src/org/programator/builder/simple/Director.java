package org.programator.builder.simple;

public class Director {

    public void Construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}

