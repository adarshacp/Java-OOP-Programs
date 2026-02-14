import java.lang.Math;

interface Resizable {
    void resize(int radius);
}

class Circle implements Resizable {

    int radius;

    // Constructor
    Circle(int radius) {
        this.radius = radius;
    }

    // Implementing interface method
    @Override
    public void resize(int radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class VTU {
    public static void main(String[] args) {

        Circle c = new Circle(10);

        System.out.println("Initial Area: " + c.area());

        // Resizing the circle
        c.resize(20);

        System.out.println("Area after resizing: " + c.area());
    }
}
