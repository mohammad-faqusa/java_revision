package java_read_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File obj = new File("./java_read_files/filename.txt");

            Scanner myReadScanner = new Scanner(obj);

            while(myReadScanner.hasNextLine()){
                System.out.println(myReadScanner.nextLine()); 

            }
            myReadScanner.close(); 

        
            // if (obj.delete()) { 
            // System.out.println("Deleted the file: " + obj.getName());
            // } else {
            // System.out.println("Failed to delete the file.");
            // } 
        
            
        } catch (FileNotFoundException  e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
}
