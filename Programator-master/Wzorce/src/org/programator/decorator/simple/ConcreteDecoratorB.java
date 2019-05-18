package org.programator.decorator.simple;

class ConcreteDecoratorB extends Decorator {
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("ConcreteDecoratorB.Operation()");
    }

    private void addedBehavior() {
        System.out.println("ConcreteDecoratorB.AddedBehavior()");
    }
}
