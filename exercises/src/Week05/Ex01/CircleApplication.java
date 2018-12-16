package Ex01;

import Ex01.Circle;

import java.awt.*;

public class CircleApplication {
    public static void main(String[] args) {

//    Create a Circle and display its name.
        Circle circle = new Circle();
        System.out.println("Circle: " + circle.getName());

////    In a new line, assign the circle variable to a Shape variable called shape. Just use the = symbol.
        Shape shape = circle;
////    Display the shape’s name.
        System.out.println("Shape: " + circle.getName());

////    Create another Circle, but this time assign it directly to a Shape with the name anotherShape.
        Shape anotherShape = new Circle();
////    Display anotherShape’s name.
        System.out.println("Another shape: " + anotherShape.getName());

////    Create the CircleTest class that tests that the Circle is working correctly as both Circle and Shape.

    }
}
