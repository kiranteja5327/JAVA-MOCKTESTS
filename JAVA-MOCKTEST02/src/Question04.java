/*
 4) Create an interface called Drawable with a method draw() that has no implementation. Implement this interface in classes Circle and Rectangle. 
 Write a program that creates objects of Circle and Rectangle and calls the draw() method on each object.
 */
interface Drawable {
    void draw();
}

class Circles implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangles implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Question04 {
    public static void main(String[] args) {
        Circles circle = new Circles();
        circle.draw(); 

        Rectangles rectangle = new Rectangles();
        rectangle.draw(); 
    }
}

