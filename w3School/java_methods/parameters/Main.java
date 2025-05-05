package parameters;

public class Main {
    public static void myMethod(String fname) {
        System.out.println(fname + " Faqusa"); 
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!"); 
        } else {
            System.out.println("Access granted - You are old enough!"); 
        }
    }

    public static void multiMyMehtod(String fname, int age) {
        System.out.println(fname + " is " + age); 
    }
    // methods overloading
    public static int myMethod(int x) {
        return 5 + x; 
    }

    public static int plusMethodInt(int x, int y) {
        return x + y ;
    }
    public static double plusMethodDouble(double x, double y) {
        return x + y ;
    }

    public static int plusMethod(int x , int y) {
        return x + y; 
    }
    public static double plusMethod(double x , double y) {
        return x + y; 
    }
    public static double plusMethod(int x , double y) {
        return x + y; 
    }
    public static void main(String[] args) {
        myMethod("Mohammad");
        myMethod("Ali");
        myMethod("Wesam");

        multiMyMehtod("Mohammad", 23);

        checkAge(23);

        System.out.println(myMethod(23)); 
    }
}
