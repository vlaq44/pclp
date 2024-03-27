package ro.unitbv.pclp2.lab5;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String pw = scanner.nextLine();
        boolean hasMinLength = pw.length() >= 8;
        boolean hasNoSpaces = true;
        boolean startsWithUppercase = false;
        boolean hasSpecialChar = false;
        boolean checkFirstLetter = true;
        for (char c : pw.toCharArray()) {
            if ( c == ' ')
                hasNoSpaces = false;
            else if( c > 'A' && c < 'Z' && checkFirstLetter)
            {
                startsWithUppercase =true;
                checkFirstLetter=false;
            }else if (c < 'a' || c > 'z')
                hasSpecialChar=true;
        }
        if (hasMinLength && hasNoSpaces && startsWithUppercase && hasSpecialChar) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid. Reasons:");
            if (!hasMinLength) {
                System.out.println("- Password must be at least 8 characters long.");
            }
            if (!hasNoSpaces) {
                System.out.println("- Password must not contain spaces.");
            }
            if (!startsWithUppercase) {
                System.out.println("- Password must begin with an uppercase letter.");
            }
            if (!hasSpecialChar) {
                System.out.println("- Password must contain at least one special character.");
            }
        }
    }
}
