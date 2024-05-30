package ro.unitbv.pclp2.lab8;

    import java.io.*;

    public class p2 {
        public static void main(String[] args) {
            File file = new File("example.txt");
            cat(file);
        }

        public static void cat(File file) {
            RandomAccessFile input = null;
            String line = null;

            try {
                input = new RandomAccessFile(file, "r");
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            } finally {
                try {
                    if (input != null) {
                        input.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }


