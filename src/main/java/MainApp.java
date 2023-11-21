import java.awt.*;
import java.util.Scanner;
    public class MainApp {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            startup();
        }
        public static void startup(){
                System.out.print("Shape Menu:\n\t1.) Add Shape\n\t2.) Exit Program\nUser Input: ");
                String userInput = input.nextLine();
                switch (userInput){
                    case "1":
                        newShape();
                        break;
                    case "2":
                        System.out.println("Thank you for using the Shape Creator!");
                        break;
                    default:
                        System.out.println("Please enter a valid option (Ex: 1 or 2).\n");
                        startup();
                        break;
                }
        }

        public static void newShape(){
            try{
                int location = 0;
                int border = 0;
                World world = new World(500, 500);
                Turtle turtle = new Turtle(0, 0, world);
                turtle.setDelay(.000001);
                System.out.print("\nPlease choose a shape to draw: \n\t1.) Circle\n\t2.) Square\n\t3.) Triangle\n\t4.) Hexagon\n\t5.) Return to Menu\nUser Input: ");
                String userInput = input.nextLine();
                switch(userInput){
                    case "1":
                        Color circleColor = colorFinder();
                        Circle newCircle = new Circle(turtle, location, border, circleColor);
                        System.out.print("\nPlease enter the radius of your new circle: ");
                        int radius = input.nextInt();
                        findPoint(turtle);
                        newCircle.drawCircle(radius);
                        break;
                    case "2":
                        Color squareColor = colorFinder();
                        Square newSquare = new Square(turtle, location, border, squareColor);
                        System.out.print("\nPlease enter the width of your new square: ");
                        int width = input.nextInt();
                        input.nextLine();
                        findPoint(turtle);
                        newSquare.drawSquare(width);
                        break;
                    case "3":
                        Color triangleColor = colorFinder();
                        Triangle newTriangle = new Triangle(turtle, location, border, triangleColor);
                        System.out.print("\nPlease enter the side length of your new triangle: ");
                        int triangleSideLength = input.nextInt();
                        findPoint(turtle);
                        newTriangle.drawTriangle(triangleSideLength);
                        break;
                    case "4":
                        Color hexagonColor = colorFinder();
                        Hexagon newHexagon = new Hexagon(turtle, location, border, hexagonColor);
                        System.out.print("\nPlease enter the side length of your new hexagon: ");
                        int hexSideLength = input.nextInt();
                        findPoint(turtle);
                        newHexagon.drawHexagon(hexSideLength);
                        break;
                    default:
                        System.out.println("Please enter a valid option (Ex: 1, 2, or 3). ");
                }
                System.out.println("\nShape successfully added! Now returning to the Main Menu...\n");
                startup();
            }
            catch(Exception inputError){
                System.out.println("There seems to have been an error with your input, please try again!\n");
                newShape();
            }
        }

        public static Color colorFinder() {
            System.out.print("Please enter the color of your shape (Ex: Red, Blue, Black, or Green): ");
            String userColor = input.nextLine();
            switch (userColor.toLowerCase()) {
                case "red":
                    return Color.RED;
                case "blue":
                    return Color.BLUE;
                case "black":
                    return Color.BLACK;
                case "green":
                    return Color.GREEN;
                default:
                    System.out.println("Invalid color input. Please try again.\n");
                    colorFinder();
                    return null;
            }
        }
        public static void findPoint(Turtle turtle){
            try{
                System.out.print("\nPlease enter the coordinates that the turtle will be located (Ex: 100,100): ");
                String chosenPoint = input.nextLine();
                String [] splitPoints = chosenPoint.split(",");
                if(splitPoints.length == 2){
                    double x = Double.parseDouble(splitPoints[0].trim()), y = Double.parseDouble(splitPoints[1].trim());
                    turtle.penUp();
                    turtle.goTo(x,y);
                    turtle.penDown();
                }
                else {
                    System.out.println("Please only enter a coordinate with two digits.\n");
                    findPoint(turtle);
                }
            }
            catch(Exception inputError){
                System.out.println("There seems to have been an error with your input, please try again!\n");
                findPoint(turtle);
            }
        }

    }
