package zadanie3;

public class Square extends Rectangle {
    @Override
    public void setA(double a) {
        super.setA(a);
    }

    @Override
    public void setB(double b) {
        super.setB(b);
    }

    public Square(int a) {
        super(a, a);
    }

    @Override
    public double getSurface() {
        return super.getSurface();
    }

    @Override
    public double getParameter() {
        return super.getParameter();
    }
}
