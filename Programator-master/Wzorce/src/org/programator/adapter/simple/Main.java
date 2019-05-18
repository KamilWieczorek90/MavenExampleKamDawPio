package org.programator.adapter.simple;

public class Main {
    public static void main(String[] args) {
        RequiredInterface foo = new AdapterComposition();
        System.out.println(foo.newMethod());

        foo = new AdapterInherit();
        System.out.println(foo.newMethod());

    }
}
