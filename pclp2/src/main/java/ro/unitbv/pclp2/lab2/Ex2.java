package ro.unitbv.pclp2.lab2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scrieti un numar: ");
        int x = scanner.nextInt();
        int suma = 0;
        while (x > 0)
        {
            suma += x % 10;
            x /= 10;
        }
        System.out.print("Suma cifrelor este: " + suma);
        scanner.close();
    }
}