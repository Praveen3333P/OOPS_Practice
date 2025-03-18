class Shape{
    void area(){
        System.out.println("area is printed here");
    }
}

class Circle extends Shape {
    void area(){
        System.out.println("Circle Area is printed here");
    }

}

class Square extends Shape{

    void area(){
        System.out.println("Square Area is printed here");
    }
}

public class Assignment1{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area();
        Square s1 = new Square();
        s1.area();
    }

}
