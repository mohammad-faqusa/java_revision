package java_exceptions;

public class Main {

    public static void main(String[] args) {
        try {
            int [] myNumbers = {1, 2, 4};
            System.out.println(); 
            System.out.println(myNumbers[2]); 
            // System.out.println(myNumbers[10]);  

            int age = 10; 

            if(age < 18) {
                throw new ArithmeticException("Not old enough!"); 
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(); 
            System.out.println(e); 
        } finally {
            System.out.println("The 'try catch' is finished"); 
        }
    }
}