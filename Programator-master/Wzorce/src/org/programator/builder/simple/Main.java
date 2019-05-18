package org.programator.builder.simple;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.Construct(b1);
        System.out.println(b1.getResult());

        director.Construct(b2);
        System.out.println(b2.getResult());
    }
}
