package zadanie3;

public abstract class AbstractShape {
    EColor Color;

    public abstract double getParameter();
    public abstract double getSurface();

    public EColor getColor() {
        return Color;
    }

    public void setColor(EColor color) {
        Color = color;
    }
}
