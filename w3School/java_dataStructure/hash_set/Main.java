package hash_set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>(); 
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda");
        System.out.println(cars); 

        if (cars.contains("Mazda")) {
            System.out.println("Mazda exists"); 

        }

        cars.remove("Ford");
        // cars.clear(); 
        System.out.println(cars.size()); 

        for (String i : cars) {
            System.out.println(i); 
            
        }

    }
}
