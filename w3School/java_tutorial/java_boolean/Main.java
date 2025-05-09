package java_boolean;

public class Main {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        System.out.println(10 > 9); // returns true, because 10 is higher than 9

        x = 10;
        System.out.println(x == 10); // returns true, because the value of x is equal to 10

        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        if(x > y) {
            System.out.println("X is greater than Y");
        }
        
    }
}
