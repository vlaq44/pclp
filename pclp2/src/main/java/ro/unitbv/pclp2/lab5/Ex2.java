package ro.unitbv.pclp2.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str = scanner.nextLine();
        char[] word = new char[str.length()];
        char[] largest = new char[str.length()];
        char[] smallest = new char[str.length()];
        int letters=0;
        int maxLetters=-1;
        int minLetters=-1;
        for(char c : str.toCharArray())
        {
            if(c==' ')
            {
                if(minLetters > letters || minLetters ==-1)
                {
                    minLetters = letters;
                    smallest=word;
                }
                if(maxLetters < letters)
                {
                    maxLetters = letters;
                    largest=word;
                }
                word = new char[str.length()];
                letters=0;
            }
            else
            {
                word[letters] = c;
                letters++;
            }
        }
        if(maxLetters == -1)
            System.out.println(str + "is the only word and it has " + letters + " letters");
        else{

            System.out.print("The smallest word is: '");
            for(int i=0;i<minLetters;i++)
                System.out.print(smallest[i]);
            System.out.print( "' and it has "+ minLetters +" letters.\n");

            System.out.print("The largest word is: '");
            for(int i=0;i<maxLetters;i++)
                System.out.print(largest[i]);
            System.out.print("' and it has "+ maxLetters +" letters.");
        }

    }
}