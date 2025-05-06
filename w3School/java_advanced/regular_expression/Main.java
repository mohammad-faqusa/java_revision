package regular_expression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE); 
        Matcher matcher = pattern.matcher("we visit W3SchOols"); 

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Mach Found"); 
        } else {
            System.out.println("Mach not Found!");      
        }
    }
}
