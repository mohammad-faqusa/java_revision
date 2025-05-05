package wrapper_classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); 
        
        Integer myInt = 5;
        Character myChar = 'M';
        Double myDouble = 5.66;

        System.out.println(myInt); 
        System.out.println(myChar); 
        System.out.println(myDouble); 
        System.out.println(myInt.toString()); 
        System.out.println(myChar.toString()); 
        System.out.println(myDouble.toString()); 
        System.out.println(myInt.getClass().getName()); 
        System.out.println(myChar.getClass().getName()); 
        System.out.println(myDouble.getClass().getName()); 
        System.out.println(myInt.intValue()); 
        System.out.println(myChar.charValue()); 
        System.out.println(myDouble.doubleValue()); 


    }
}
