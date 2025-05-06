
package addTwoNumbers;

import java.util.Scanner; 


class Main {

    
    public static void main(String[] args) {
        int x, y, sum; 
        System.out.println("Enter your first number : "); 

        Scanner obj = new Scanner(System.in);

        x = obj.nextInt();

        System.out.println("Enter the second number : "); 

        y = obj.nextInt(); 

        sum = x + y; 

        System.out.println("Here is the sum : " + sum ); 
        
        
    }
    
}