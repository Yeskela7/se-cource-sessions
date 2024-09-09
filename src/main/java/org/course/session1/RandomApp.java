package org.course.session1;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        // one double value from the range [0..1)
        double rnd1 = Math.random();
        System.out.println(rnd1);
        System.out.println((int) (rnd1 * 2)); // cast to int from 0 to 1

        System.out.println("------------------------------");
        // many values
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int rnd2 = random.nextInt();
            System.out.println(rnd2);
        }
        System.out.println("------------------------------");

        // many values from range [0, N) -- n = 3 in example
        for (int i = 0; i < 3; i++) {
            int rnd2 = random.nextInt(10);
            System.out.println(rnd2);
        }
    }
}
