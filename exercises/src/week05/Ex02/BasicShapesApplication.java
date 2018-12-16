package Ex02;

import Ex01.Circle;
import Ex01.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicShapesApplication {
    public static void main(String[] args) {
//        Create a Circle as a Shape, name it circle and display its name.
        Shape circle = new Circle();
        System.out.println("Shape: " + circle.getName());

//        Create a Square as a Shape, name it square and display its name.
        Shape square = new Square();
        System.out.println("Shape: " + square.getName());

//        Create a Triangle as a Shape, name it triangle and display its name.
        Shape triangle = new Triangle();
        System.out.println("Shape: " + triangle.getName());

//        Create a list of Circle named circles and try to add circle, square and triangle to it.
//        It doesn’t work because circle is not a Circle now, it is a Shape, and it’s not the same.
//        Also, square and triangle don’t work either because they are not Circles.

//        List<Circle> circles = new ArrayList<>();
//        circles.addAll(circle, square, triangle);

//        Create a list of Shape named shapes and add circle to it.
//        Try to add square and triangle as well.
//        It works because the three of them are shapes.
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);

//      Display the list.
//      It shows memory addresses.
//        System.out.println(shapes); //will print memory addresses

//      Implement the toString methods in each one of the three Shapes returning the name of the shape itself
//      by reusing the interface method. Display it now.
        System.out.println(shapes);


//        Use a foreach loop to go through all the shapes and one by one display its names.
        for (Shape shape : shapes) {
            System.out.println("Shape name: " + shape);
        }
//        Create the SquareTest class that tests that the Square is working correctly as both Square and Shape.
//        Create the TriangleTest class that tests that the Triangle is working correctly as both Triangle and Shape.
    }
}
