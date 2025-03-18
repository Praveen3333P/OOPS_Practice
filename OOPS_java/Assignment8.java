class Calculator {
    public int add(int x, int y){
        return x+y;
    }

    public int add(int x,int y, int z){
        return x+y+z;
    }

    public float add(float x, float y){
        return x+y;
    }
}


public class Assignment8 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        System.out.println(c1.add(1,2));
        System.out.println(c1.add(1,2,3));
        System.out.println(c1.add(1.2f,3.4f));
    }
}
