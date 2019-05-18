package org.programator.prototype.computer;

public class Cores implements Cloneable{
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Cores(int i) {
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Cloning Cores: " + this.getI());
        Cores cores = (Cores) super.clone();
        cores.setI(this.getI());
        return cores;
    }

    @Override
    public String toString() {
        return " CORE= " + i;
    }
}
