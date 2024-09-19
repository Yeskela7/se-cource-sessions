package org.course.session2;

import java.util.Arrays;

public class ArrayFilter {
    public static void main(String[] args) {
        int[] origin = generate(100);
        int[] negatives = filter_negatives(origin);
        int[] odd = filter_odd(origin);
        int[] even = filter_even(origin);

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(even));

        //        System.out.println("[" + origin[0] + ", " + origin[1] + "]");

    }

    private static int[] filter_even(int[] origin) {
        int[] evenArr = new int[origin.length];
        int index = 0;

        for(int item : origin) {
            if (item >= 0 && item % 2 == 0) {
                evenArr[index++] = item;
            }
        }

        return Arrays.copyOf(evenArr, index);
    }

    private static int[] filter_odd(int[] origin) {
        return null;
    }

    private static int[] filter_negatives(int[] origin) {
        return null;
    }

    private static int[] generate(int length) {
        int [] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 - 50);
        }

        return arr;
    }
}
