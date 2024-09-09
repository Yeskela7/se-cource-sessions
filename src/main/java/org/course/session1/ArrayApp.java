package org.course.session1;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = new int[10]; // init array
        int len = arr.length; //get array's length

        System.out.println(arr.length);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        arr[1] = 5; //set 2nd element of array (position starts from 0) equals to 5
        System.out.println(Arrays.toString(arr)); // print for checking


        // set
        for (int i = 0; i < len; i++) {
            arr[i] = i;
        }

        int i = 0;
        while (i < len) {
            System.out.println(arr[i]);
            i++;
        }


    }
}
