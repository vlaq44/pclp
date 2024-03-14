package ro.unitbv.pclp2.lab3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        if(x>=0)
            System.out.print("Pozitiv");
        else
            System.out.print("Negativ");
    }
}