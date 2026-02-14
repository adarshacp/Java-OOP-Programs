abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class TestShape {
    public static void main(String[] args) {

        Shape cir = new Circle(10);
        Shape tri = new Triangle(3, 4, 5);

        System.out.println("Circle:");
        System.out.printf("Circle Area: %.4f\n", cir.calculateArea());
        System.out.printf("Circle Perimeter: %.4f\n", cir.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + tri.calculateArea());
        System.out.println("Perimeter: " + tri.calculatePerimeter());
    }
}
