package org.course.session2;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] x = new int[10];

        //filling with random
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 10 + 1);
        }

        //copy way 1
        int[] y = x.clone();
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        int[] z = new int[15];
        System.arraycopy(x, 0 , z, 0, 10);
        System.out.println(Arrays.toString(z));


    }
}
