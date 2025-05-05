package java_linkedList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>(); 


        cars.add("Ford");
        cars.add("Volvo");

        System.out.println(cars); 

        cars.addFirst("Farari");
        System.out.println(cars); 

        cars.addLast("pegut");

        cars.removeFirst();
        System.out.println(cars); 
        cars.removeLast();
        System.out.println(cars); 
        cars.getFirst();
        cars.getLast();
        
        System.out.println(cars.get(0)); 
        cars.set(0, "rx.vision"); 
        System.out.println(cars); 



        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars); 
        Collections.sort(cars);
        System.out.println(cars); 


    }
}
