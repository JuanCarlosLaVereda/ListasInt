package Exercise;

public class Main {
    public static void main(String[] args) {
        Bombo bombo = new Bombo();
        bombo.initialize();
        for (int i = 0; i <5; i++) {
            bombo.girar();
            System.out.println(bombo.getBola());
        }
        System.out.println(bombo);


    }
}
