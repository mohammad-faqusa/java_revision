package java_iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> cars = new HashMap<String, Integer>();
        cars.put("Volvo", 1);
        cars.put("BMW", 1);
        cars.put("Ford", 1);
        cars.put("Mazda", 1);

        Iterator<String> it = cars.keySet().iterator();
        
        while(it.hasNext()){
             
            if(it.next().equals("Ford")){
                it.remove(); 

            }
            
        }

        System.out.println(cars); 
        

    }
    
}
