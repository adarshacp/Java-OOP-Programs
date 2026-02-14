interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {

    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + width);
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + height);
    }

    void display() {
        System.out.println("Rectangle Dimensions: width = " 
                           + width + ", height = " + height);
    }
}

public class IFC {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 20);

        System.out.println("Initial Dimensions:");
        r.display();

        r.resizeWidth(30);
        r.resizeHeight(40);

        System.out.println("\nDimensions after resizing:");
        r.display();
    }
}
