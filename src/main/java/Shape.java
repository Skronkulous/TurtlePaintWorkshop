import java.awt.*;
public abstract class Shape {
    protected Turtle turtle;
    protected int border, location;
    protected Color color;

    public Shape(Turtle turtle, int border, int location, Color color) {
        this.turtle = turtle;
        this.border = border;
        this.location = location;
        this.color = color;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
