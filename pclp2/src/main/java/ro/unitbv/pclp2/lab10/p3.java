package ro.unitbv.pclp2.lab10;

import java.io.*;

public class p3 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduceți textul. Pentru a încheia, tastați 'exit':");

            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Textul a fost salvat în fișierul output.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

