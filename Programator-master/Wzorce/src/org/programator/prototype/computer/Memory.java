package org.programator.prototype.computer;

public class Memory implements Cloneable{
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Memory clone() throws CloneNotSupportedException {
        System.out.println("Cloning Memory object: " + this.getCapacity());
        Memory  m = (Memory) super.clone();
        m.setCapacity(this.getCapacity());
        return m;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                '}';
    }
}
