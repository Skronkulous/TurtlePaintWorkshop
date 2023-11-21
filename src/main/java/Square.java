import java.awt.*;

public class Square extends Shape {
    public  Square(Turtle turtle, int location, int border, Color color) {
        super(turtle, location, border, color);
    }

    public void drawSquare(int length) {
        turtle.setColor(color);
        for (int j = 0; j < 4; j++) {
            turtle.forward(length);
            turtle.turnRight(90);
        }
    }
}