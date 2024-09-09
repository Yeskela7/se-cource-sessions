package org.course.session1;

public class ControlApp {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        if (a == b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        boolean bool = true;
        if (bool) {
            System.out.println("bool is " + bool);
        }
        if (1 <= 1) {
            System.out.println("def");
        } else if (1 > 2) {
            System.out.println("def");

        } else if (1 != 2) {
            System.out.println("def");

        } else {
            System.out.println("def");
        }

        String str = "str";

        String result; //default value is null
        switch (str) {
            case "str":
                result = "first";
                break;
            case "stra":
                result = "second";
                break;
            default:
                result = "default";
                break;
        }

        String firstString = "string";
        String secondString = "string"; //same ref with fString
        String newString = new String("string");

        System.out.println(firstString == secondString); //true -- compare reference
        System.out.println(firstString == newString); //false -- compare reference
        System.out.println(firstString.equals(newString)); //true -- compare values


    }
}
