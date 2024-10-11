import java.util.Random;

public class Rnd {
    private Random rnd;

    public Rnd() {
        rnd = new Random(1000);
    }

    public void generateNumbers() {
        for (int i = 0; i < 50; i++) {
            System.out.print(rnd.nextInt(100) + " ");
        }
        System.out.println();
    }
}