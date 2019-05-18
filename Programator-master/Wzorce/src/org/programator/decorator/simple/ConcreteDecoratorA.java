package org.programator.decorator.simple;

class ConcreteDecoratorA extends Decorator {
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorA.Operation()");
    }
}
