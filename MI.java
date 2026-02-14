class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

interface Cost {
    double calculateCost();
}

class Shipment extends Box implements Cost {

    double weight;

    Shipment(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public double calculateCost() {
        return weight * 50;   // example cost calculation
    }
}

public class MI {
    public static void main(String[] args) {

        Shipment s = new Shipment(10, 20, 30, 40);

        System.out.println("Volume: " + s.volume());
        System.out.println("Weight: " + s.weight);
        System.out.println("Cost: " + s.calculateCost());
    }
}
