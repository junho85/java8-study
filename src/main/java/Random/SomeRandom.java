package Random;

import java.util.Random;

public class SomeRandom {
    static void test() {
        Random random = new Random();
        Random random2 = new Random();
        Random random3 = new Random();
        System.out.println(random.nextInt());
        System.out.println(random2.nextInt());
        System.out.println(random3.nextInt());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            test();
        }
    }
}
