package org.programator.prototype.computer;

public class Computer implements Cloneable{
    private Processor processor;
    private Memory memory;
    private GraphicsCart graphicsCart;

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

    public GraphicsCart getGraphicsCart() {
        return graphicsCart;
    }

    public void setGraphicsCart(GraphicsCart graphicsCart) {
        this.graphicsCart = graphicsCart;
    }

    public Computer(Processor processor, Memory memory, GraphicsCart graphicsCart) {
        this.processor = processor;
        this.memory = memory;
        this.graphicsCart = graphicsCart;
    }
    public Computer clone() throws CloneNotSupportedException {
//        System.out.println("Cloning Computer object..");
        Computer  c = (Computer) super.clone();
        // DeepCopy
//        c.setMemory(this.getMemory().clone());
//        c.setProcessor(this.getProcessor().clone());
//        c.setGraphicsCart(this.getGraphicsCart().clone());
        // ShallowCopy
        c.setMemory(this.getMemory());
        c.setProcessor(this.getProcessor());
        c.setGraphicsCart(this.getGraphicsCart());
        return c;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", graphicsCart=" + graphicsCart +
                '}';
    }
}
