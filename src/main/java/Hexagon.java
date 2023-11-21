import java.awt.*;

public class Hexagon extends Shape{
    public Hexagon(Turtle turtle, int location, int border, Color color) {
        super(turtle, location, border, color);
    }
    public void drawHexagon(int sideLength){
        turtle.setColor(color);
        for(int j = 0; j < 6;j++){
            turtle.forward(sideLength);
            turtle.turnRight(60);
        }
    }

}
