package ro.unitbv.pclp2.lab5;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String str = scanner.nextLine();
        System.out.println("Enter the word you want to replace: ");
        String a = scanner.nextLine();;
        System.out.println("Enter the replacement for that word");
        String b = scanner.nextLine();;
        String newStr = str.replaceAll(a, b);
        System.out.println(newStr);
    }
}
