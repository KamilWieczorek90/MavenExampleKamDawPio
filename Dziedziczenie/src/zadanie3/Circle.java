package zadanie3;

public class Circle extends AbstractShape {

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getParameter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getSurface() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;


}
