package org.course.session1;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println(addName(name));
    }


    private static String addName(String name) {
        return "Salam " + name;
    }

}
