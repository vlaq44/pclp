package ro.unitbv.pclp2.lab3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        int x = scanner.nextInt();
        scanner.close();
        int sp=0,si=0;
        while(x>0)
        {
            if(x%2==0)
                sp+=x%10;
            else
                si+=x%10;
            x/=10;
        }
        System.out.print("Suma cifrelor pare: "+sp);
        System.out.print("\nSuma cifrelor impare: "+si);
    }
}