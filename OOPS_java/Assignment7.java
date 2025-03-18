interface Playable{
    public void playsound();
}

class Guitar implements Playable{
    public void playsound(){
        System.out.println("Guitar sound is playing");
    }
}

class Piano implements Playable{
    public void playsound(){
        System.out.println("Piano is playing");
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Guitar g1 = new Guitar();
        Piano p1 = new Piano();

        g1.playsound();
        p1.playsound();
    }
}
