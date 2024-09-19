package org.course.session2;

public class ControlStructuresLoops {
    public static void main(String[] args) {
//        for loop
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("---------------");

        for (int i = 10; i > 0; i--) {

            System.out.println(i);
        }
        System.out.println("---------------");

        for (int i = 0; ; i++) {
            if (i > 10) break;
            System.out.println(i);
            }
        System.out.println("---------------");

        for (int i = 0; ; ) {
            if (i > 10) break;
            System.out.println(i);
            i++;
        }
        System.out.println("---------------");

        int i = 0;
        for ( ; ; ) {
            if (i >= 10) {
                System.out.println(i);
                break;
            }
            System.out.print(i + ", ");
            i++;
        }
        System.out.println("---------------");


        char letter = 'A';
        while (letter < 'Z' + 1) {
            System.out.printf("%c ", letter);
            letter++;
        }

        char a = 'a';
        while (true) {
            if (a > 'z') break;
            System.out.printf("%c ", a);
            a++;
        }

    }

}
