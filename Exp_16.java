abstract class Shape {
    int length;
    int width;

    public abstract void printArea();
}

class Rectangle extends Shape {
    public void printArea() {
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}

class Triangle extends Shape {
    public void printArea() {
        double area = 0.5 * length * width;
        System.out.println("The area of the triangle is: " + area);
    }
}

class Circle extends Shape {
    public void printArea() {
        double area = 3.14 * length * length;
        System.out.println("The area of the circle is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 5;
        r.width = 10;
        r.printArea();

        Triangle t = new Triangle();
        t.length = 5;
        t.width = 10;
        t.printArea();

        Circle c = new Circle();
        c.length = 5;
        c.printArea();
    }
}
