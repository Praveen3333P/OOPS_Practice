abstract class Vehicle {
    abstract void start_engine();
}

class Car extends Vehicle {
    public void start_engine(){
        System.out.println("Car Engine Started");
    }
}

class Bike extends Vehicle{
    public void start_engine(){
        System.out.println("Bike Engine Started");
    }
}


public class Assignment3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();

        c1.start_engine();
        b1.start_engine();
        }
}
