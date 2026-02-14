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

class BoxWeight extends Box {
    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);   // correct super call
        this.weight = weight;
    }

    public void display() {
        System.out.println("Volume: " + super.volume());
        System.out.println("Weight of the box: " + weight);
    }
}

class SingleLevel {
    public static void main(String[] args) {
        BoxWeight bw = new BoxWeight(10, 20, 30, 100);
        bw.display();
    }
}
