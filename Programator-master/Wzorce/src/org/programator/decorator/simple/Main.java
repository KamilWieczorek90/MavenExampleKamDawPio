package org.programator.decorator.simple;

public class Main {
    public static void main(String[] args) {
        // Create ConcreteComponent and two Decorators
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        // Link decorators
        d1.setComponent(c);
        d2.setComponent(d1);

        d2.operation();
    }
}
