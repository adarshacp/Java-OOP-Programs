class Vehcile{
    Vehcile(){
    System.out.println("This is a vehicle");
}
}

class FourWheeler extends Vehcile{
    FourWheeler(){
        System.out.println("This is a four wheeler");
    }
}

class Car extends FourWheeler{
    Car(){
        System.out.println("This 4 wheeler Vehicle is car");
    }
}

public class MultiLevel{
     public static void main(String[] args) {
       Car c = new Car();
    }
}