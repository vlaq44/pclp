package ro.unitbv.pclp2.lab5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String a = scanner.nextLine();
        System.out.print("Enter second text: ");
        String b = scanner.nextLine();
        boolean anagram = true;
        if (a.length() != b.length()) {
            anagram = false;
        } else {
            int[] frequency = new int[256];
            for (char c : a.toCharArray())
                frequency[(int) c]++;
            for (char c : b.toCharArray()) {
                if (frequency[(int) c] == 0) {
                    anagram = false;
                    break;
                } else {
                    frequency[(int) c]--;
                }
            }
        }
        if (anagram)
            System.out.println("The words are anagrams!");
        else
            System.out.println("The words are not anagrams.");
    }
}
