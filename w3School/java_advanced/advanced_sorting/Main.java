package advanced_sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList; 

class Car {
    public String brand;
    public String model;
    public int year; 

    public Car(String b, String m, int y){
        brand = b;
        model = m;
        year = y; 
    }
}

class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Car a = (Car) obj1;
        Car b = (Car) obj2; 

        if(a.year < b.year) return -1; 
        if(a.year > b.year) return 1; 

        return 0; 
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Comparator myComparator = new SortByYear();
        // Collections.sort(myCars, myComparator);

        
        Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1; 
            Car b = (Car) obj2; 
            
            if(a.year < b.year) return -1;
            if(a.year > b.year) return 1;
            
            return 0; 
        });
        
        for (Car c : myCars) {
            System.out.println(c.model + " " + c.brand + " " + c.year); 
        }

        Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1; 
            Car b = (Car) obj2; 
            
            boolean aIsEven = (a.year % 2) == 0;
            boolean bIsEven = (b.year % 2) == 0;
            
            if(aIsEven == bIsEven){
                if (a.year < b.year ) return -1 ;
                if (a.year > b.year) return 1; 
                return 0; 
            } else {
                if(aIsEven) return -1;
                if(bIsEven) return 1; 
            }
            return 0; 
        });

        for (Car c : myCars) {
            System.out.println(c.model + " " + c.brand + " " + c.year); 
        }
    }
}
