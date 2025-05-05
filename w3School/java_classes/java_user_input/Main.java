package java_user_input;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner myObjScanner = new Scanner(System.in);
        System.out.println("Enter the username : "); 

        String userName = myObjScanner.nextLine();
        System.out.println("Username is : "+ userName); 

        System.out.println("Enter you age "); 
        int age = myObjScanner.nextInt();
        System.out.println("This is your age : " + age); 

        System.out.println("Enter your salary : "); 
        double salary = myObjScanner.nextDouble();
        System.out.println("Your salary is : " + salary); 
        

    }
}
