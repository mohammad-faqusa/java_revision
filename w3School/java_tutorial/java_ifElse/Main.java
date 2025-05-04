package java_ifElse;

// Use if to specify a block of code to be executed, if a specified condition is true
// Use else to specify a block of code to be executed, if the same condition is false
// Use else if to specify a new condition to test, if the first condition is false
// Use switch to specify many alternative blocks of code to be executed


public class Main {

    public static void main(String[] args) {
        if (2>1) {
            System.out.println("Hello world !");
        }
        if (2 == 2) {
            System.out.println("the numbers are equal");
        }

        int x = 20;
        int y = 25;
        
        if (x > y) {
            System.out.println("x is greater than y");
            
        } 

        if (x > y) {
            System.out.println("this is first condition");
        } else if (x<y) {
            System.out.println("this is second condition");
        } else {
            System.out.println("this is the last condition");
        }

        if (true) {
            System.out.println("this is true");
        }

        int z = (x > y) ? x : y; 
        System.out.println(z);


        // Real-Life example 
        int doorCode = 1337;

        if (doorCode==1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        int myNum = 10; 
        if (myNum > 0) {
            System.out.println("The vlaue is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is negative number.");
        } else {
            System.out.println("the value is 0.");
        }

        int myAge = 25;
        int votingAge = 18; 

        if (myAge > votingAge) {
            System.out.println("Old enoug to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        if (myNum % 2 == 0) {
            System.out.println(myNum + " is even");
        } else {
            System.out.println(myNum + " is odd");
        }
    }
    
}
