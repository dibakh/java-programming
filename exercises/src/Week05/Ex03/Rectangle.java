package Ex03;


import Ex01.Shape;

public class Rectangle implements Colored,Shape{
    @Override
    public String toString() {
        return getName()+" "+getColor();
    }

    @Override
    public String getColor() {
        return "violet";
    }

    @Override
    public String getName() {
        return "rectangle";
    }

//    Create the Rectangle class that implements the Colored interface.
//    Implement the getColor method with the help of Intellij.
//    Return the color of your choice in that method.
}

