package org.programator.adapter.simple;

public class AdapterComposition implements RequiredInterface {
    private Adapted adapted;
    public AdapterComposition() { adapted = new Adapted(); }
    public int newMethod() {return adapted.oldMethod();}
}