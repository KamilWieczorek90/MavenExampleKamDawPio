package org.programator.prototype.computer;

public class Processor implements Cloneable{
    double speed;
    Cores cores;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Cores getCores() {
        return cores;
    }

    public void setCores(Cores cores) {
        this.cores = cores;
    }

    public Processor(double speed, Cores cores) {
        this.speed = speed;
        this.cores = cores;
    }

    @Override
    public Processor clone() throws CloneNotSupportedException {
//        System.out.println("Cloning Processor object: " + this.getSpeed());
        Processor  p = (Processor) super.clone();
        p.setSpeed(this.getSpeed());
        p.setCores(this.getCores());
        return p;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "speed=" + speed +
                " ,cores=" + cores +
                '}';
    }
}
