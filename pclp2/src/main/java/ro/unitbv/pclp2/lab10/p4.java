package ro.unitbv.pclp2.lab10;

import java.io.*;

public class p4 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("test02.in");
            StreamTokenizer tokenizer = new StreamTokenizer(fileReader);

            tokenizer.wordChars('a', 'z');
            tokenizer.wordChars('A', 'Z');
            tokenizer.ordinaryChar('-');

            int wordCount = 0;
            int tokenType;

            while ((tokenType = tokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
                if (tokenType == StreamTokenizer.TT_WORD) {
                    wordCount++;
                }
            }

            fileReader.close();

            System.out.println("Numărul de cuvinte din fișier este: " + wordCount);
        } catch (IOException e) {
            // Tratarea excepțiilor de IO
            e.printStackTrace();
        }
    }
}
