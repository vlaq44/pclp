package ro.unitbv.pclp2.lab2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Grade Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);
        scanner.close();
    }
}