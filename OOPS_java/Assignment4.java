abstract class Vehicle{
    public void fuel_type(){
        System.out.println("Generic Fuel is printed here");
    }
}

class Car extends Vehicle{
    public void fuel_type(){
        System.out.println("Disel is used in this");
    }
}

class Bike extends Vehicle{
    public void fuel_type(){
        System.out.println("Petrol is used in this");
    }
}


public class Assignment4 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();

        c1.fuel_type();
        b1.fuel_type();
    }
}
