package hash_map;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Palestine", "Jerusalem"); 
        System.out.println(capitalCities.get("Palestine")); 
        capitalCities.put("Jordan", "Amman"); 
        capitalCities.clear();
        // capitalCities.remove("Jordan"); 

        for (String st : capitalCities.keySet()) {
            System.out.println(st); 
            
            
        }


    }
    
}
