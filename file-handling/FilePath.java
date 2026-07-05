import java.io.*;

class FilePath {

    public static void main(String[] args) {

        File directory = new File("C:/Users/santo/OneDrive/Desktop/notes");

        File[] myFiles = directory.listFiles();

        if (myFiles != null) {

            System.out.println("\nFiles present in the specified directory: \n");

            for (File file : myFiles) {
                System.out.println("\t" + file);
            }

        } else {
            System.out.println("The specified directory does not exist or cannot be accessed.");
        }
    }
}