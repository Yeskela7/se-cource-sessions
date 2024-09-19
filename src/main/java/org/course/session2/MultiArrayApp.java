package org.course.session2;

public class MultiArrayApp {
    public static void main(String[] args) {
        int[] arrayEmpty = new int[5];
        int[] arrayFull = {1, 2, 3, 4};
        System.out.println(arrayEmpty[2]);
        System.out.println(arrayFull[2]);

        int[][] arrayTwoD = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][][] array3 = {{{1,2}, {13,4}}, {{22, 44},{332, 333}}};

        System.out.println(arrayTwoD[2][2]);

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < array3[i][j].length; k++) {
                    System.out.printf("%s", array3[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }

    }
}
