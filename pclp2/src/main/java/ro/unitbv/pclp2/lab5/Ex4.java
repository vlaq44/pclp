package ro.unitbv.pclp2.lab5;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Line:");
        String a = scanner.nextLine();
        System.out.println("Second Line:");
        String b = scanner.nextLine();
        System.out.println("Comparing " + a + " and " + b + ": " + (a.equals(b)));
    }
}
