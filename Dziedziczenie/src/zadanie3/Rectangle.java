package zadanie3;

public class Rectangle extends AbstractShape {
    protected double a;
    protected double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getParameter() {
        return (2*a) + (2 * b);
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSurface() {
        return a*b;
    }
}
