package countWords;

import java.util.Arrays;
import java.util.HashMap; 
public class Main {

    public static void main(String[] args) {
        String words = "one two three four";

        int countWords = words.split(" ").length; 
        System.out.println(countWords); 
        String[] arr = words.split(" "); 

        System.out.println(arr); 

        for (String string : arr) {
            System.out.println(string); 
        }

        String originalString = "Hello"; 
        String reversedString = ""; 

        for (int i = 0; i < originalString.length(); i++) {
            reversedString = originalString.charAt(i) + reversedString; 
        }

        System.out.println("The reversed string : " + reversedString ); 

        // calculate the sum of the array 

        int[] arrInt = {2 , 5 , 1 , 10 , 6}; 

        int sum = 0 ; 
        
        for (int i : arrInt) {
            sum += i;       
        }

        System.out.println("here is the sum of the array : " + sum ); 

        String myStr = "Hello"; 
        String[] strArr = myStr.split(""); 
        
        for (String iString : strArr) {
            System.out.println(iString); 
        }
        char[] charArr = myStr.toCharArray();

        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};

        Arrays.sort(cars);

        for (String string : cars) {
            System.out.println(string); 
        }

        float avg = (float) sum / arrInt.length; 
        System.out.println(avg); 

        int min = arrInt[0]; 

        for (int i : arrInt) {
            if(i < min) min = i; 
        }

        System.out.println(min); 

        HashMap<String,String> countrieHashMap = new HashMap<String,String>();

        countrieHashMap.put("Palestine", "Jerusalem"); 
        countrieHashMap.put("Jordan", "Amman"); 
        countrieHashMap.put("Ejypt", "Cairo"); 

        for (String string : countrieHashMap.values()) { // .keySet() 
            System.out.println(string); 
        }

        // loop through enum 
        enum Level {
            LOW,
            MEDIUM,
            HIGH
          }
        for (Level myVarLevel : Level.values()) {
            System.out.println(myVarLevel); 
        }

    }
}