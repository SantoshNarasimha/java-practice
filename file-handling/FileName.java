import java.io.*;

class FileName {

    public static void main(String[] args) {

        File directory = new File("C:/Users/santo/OneDrive/Desktop/notes");

        String[] myFile = directory.list();

        if (myFile != null) {

            System.out.println("Files present in the specified location:");

            for (String file : myFile) {
                System.out.println(file);
            }

        } else {
            System.out.println("Directory not found or cannot be read.");
        }
    }
}