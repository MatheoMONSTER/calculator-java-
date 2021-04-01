package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        double a = numbers.nextDouble();
        char sign = numbers.next().charAt(0);
        double b = numbers.nextDouble();
        switch (sign) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            default -> System.out.println("Incorrect input");
        }

    }
}
