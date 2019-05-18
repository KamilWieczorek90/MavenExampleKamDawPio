package org.programator.prototype.computer;

public class GraphicsCart implements Cloneable{
    private Processor processor;
    private Memory memory;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public GraphicsCart(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }

    public GraphicsCart clone() throws CloneNotSupportedException {
//        System.out.println("Cloning GraphicsCart object..");
        GraphicsCart  gc = (GraphicsCart) super.clone();
        gc.setMemory(this.getMemory().clone());
        gc.setProcessor(this.getProcessor().clone());
        return gc;
    }

    @Override
    public String toString() {
        return "GraphicsCart{" +
                "processor=" + processor +
                ", memory=" + memory +
                '}';
    }
}
