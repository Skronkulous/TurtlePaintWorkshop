import java.awt.*;
public class Circle extends Shape{

    public Circle(Turtle turtle, int border, int location, Color color) {
        super(turtle, border, location, color);
    }

    public void drawCircle(int radius){
        int sides = 360, angle = 360/sides;
        turtle.setColor(color);
        for(int j = 0; j < sides; j++){
            turtle.forward(radius);
            turtle.forward(angle);
        }
    }
}
