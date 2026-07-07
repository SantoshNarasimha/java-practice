// Lists only the files with the .txt extension from the specified directory.

import java.io.*;

class ListTextFiles {

    public static void main(String[] args) {

        File directory = new File("C:/Users/santo/OneDrive/Desktop/notes");

        // Anonymous Inner Class

        File[] myFiles = directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".txt");
            }
        });
/*
        File[] myFile = directory.listFiles(
                file -> file.getName().endsWith(".txt"));
 */
        System.out.println("\n .txt files are : \n");

        for (File file : myFiles) {
            System.out.println(file.getName());
        }


    }

}