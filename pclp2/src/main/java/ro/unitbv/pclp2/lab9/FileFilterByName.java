package ro.unitbv.pclp2.lab9;

import java.io.*;

public class FileFilterByName implements FilenameFilter {
    private String[] acceptedExtensions;
    private String[] keywords;

    public FileFilterByName(String[] acceptedExtensions, String[] keywords) {
        this.acceptedExtensions = acceptedExtensions;
        this.keywords = keywords;
    }

    @Override
    public boolean accept(File dir, String name) {
        for (String extension : acceptedExtensions) {
            if (name.endsWith(extension)) {
                for (String keyword : keywords) {
                    if (name.contains(keyword)) {
                        return true;
                    }
                }
            }
        }
        return false; // Fișier respins
    }

    public static void main(String[] args) {
        try {
            BufferedReader extensionReader = new BufferedReader(new FileReader("extension.in"));
            String extensionLine = extensionReader.readLine();
            String[] acceptedExtensions = extensionLine.split("\\s+");

            BufferedReader keywordReader = new BufferedReader(new FileReader("words.in"));
            String keywordLine = keywordReader.readLine();
            String[] keywords = keywordLine.split("\\s+");

            FileFilterByName fileFilter = new FileFilterByName(acceptedExtensions, keywords);

            File directory = new File("path_to_directory");

            File[] filteredFiles = directory.listFiles(fileFilter);

            if (filteredFiles != null) {
                for (File file : filteredFiles) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("Nu s-au găsit fișiere conform filtrului.");
            }

            extensionReader.close();
            keywordReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

