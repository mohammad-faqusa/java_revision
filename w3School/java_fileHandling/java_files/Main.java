package java_files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
public class Main {

    public static void main(String[] args) {
        

        // System.out.println(myObjFile.canWrite()); 
        // System.out.println(myObjFile.canRead()); 

        try {
            FileWriter myObjFile = new FileWriter("filename.txt");
            // if(myObjFile.createNewFile()){
            //     System.out.println("File created : " + myObjFile.getName()); 
    
            // } else {
            //     System.out.println("File already exists "); 
            // }

            myObjFile.write("Hello my name is mohammad");
            myObjFile.close(); 

            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        

    }
}