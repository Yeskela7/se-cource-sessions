package org.course.session1;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number");
        int firstNumber = sc.nextInt();
        System.out.println("Write second number");
        int secondNumber = sc.nextInt();
        double result = 0;
        System.out.println("Write your operator: plus, minus, mult, div");
        String operator = sc.next();

        if (operator.equals("plus")) {
            result = firstNumber + secondNumber;
        } else if (operator.equals("minus")) {
            result = firstNumber - secondNumber;

        }else if (operator.equals("mult")) {
            result = firstNumber * secondNumber;

        }else if (operator.equals("div")) {
            result = (double) firstNumber / secondNumber; // this code without checking if second number is 0
        } else {
            System.out.println("Wrong operator");
            throw new RuntimeException();
        }

        System.out.printf("your operation: %d %s %d \n", firstNumber, operator, secondNumber);
        System.out.printf("Your result is: %s \n", result);

    }

}
