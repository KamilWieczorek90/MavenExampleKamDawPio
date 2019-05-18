package org.programator.adapter.simple;

public class AdapterInherit
        extends Adapted
        implements RequiredInterface
{
    public AdapterInherit() {}
    public int newMethod() { return oldMethod(); }
}
