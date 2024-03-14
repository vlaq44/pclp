package ro.unitbv.pclp2.lab3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        switch(x)
        {
            case 1: System.out.print("Luni");
                break;
            case 2: System.out.print("Marti");
                break;
            case 3: System.out.print("Miercuri");
                break;
            case 4: System.out.print("Joi");
                break;
            case 5: System.out.print("Vineri");
                break;
            case 6: System.out.print("Sambata");
                break;
            case 7: System.out.print("Duminica");
                break;
            default: System.out.print("mai incearca");
                break;
        }
    }
}