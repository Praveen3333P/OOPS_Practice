class Shape{
    public void area(){
        System.out.println("area is printed here");
    }
}

class Circle extends Shape {
    public void area(){
        System.out.println("Circle Area is printed here");
    }

}

class Square extends Shape{

    public void area(){
        System.out.println("Square Area is printed here");
    }
}

public class Assignment2 {

    public static void describe_shape(Shape shape){
        shape.area();
    }
    
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        Square s1 = new Square();

        describe_shape(c1);
        describe_shape(s1);
    }
    
}
