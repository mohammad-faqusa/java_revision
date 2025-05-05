
package java_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    
    public static void main(String[] args) {
        String[] arr = {"Mohamamd", "Khaled", "Faqusa"}; // this is static array 
    
        ArrayList<String> cars = new ArrayList<String>(); 
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars); 
        
        cars.add(0, "Marcidies");
        
        System.out.println(cars); 

        System.out.println(cars.get(1)); 
        cars.set(1, "Hundai"); 

        System.out.println(cars); 
        cars.remove(0); 
        System.out.println(cars); 
        // cars.clear(); 
        System.out.println(cars); 
        System.out.println(cars.size()); 

        String name = "Mohammad";
        System.out.println(name.length()); 

        for (String str : cars) {
            System.out.println(str); 
        }

        ArrayList<Integer> myNumbIntegers = new ArrayList<Integer>(); // Create an ArrayList object
        myNumbIntegers.add(50);
        myNumbIntegers.add(20);
        myNumbIntegers.add(30);
        myNumbIntegers.add(20);
        myNumbIntegers.add(5);

        System.out.println(myNumbIntegers); 

        Collections.sort(myNumbIntegers); 

        System.out.println(myNumbIntegers); 

        for(int i : myNumbIntegers){
            System.out.println(i); 
        }
    }

}