package ro.unitbv.pclp2.lab3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti varsta dumneavoastra: ");
        int x = scanner.nextInt();
        scanner.close();
        switch (x) {
            case 0:
                System.out.println("Varsta invalida");
                break;
            case 18:
                System.out.println("Sunteti exact major, aveti voie sa votati!");
                break;
            default:
                if (x > 18) {
                    System.out.println("Sunteti major, aveti voie sa votati!");
                } else {
                    System.out.println("Sunteti minor, nu aveti voie sa votati!");
                }
                break;
        }
    }
}
