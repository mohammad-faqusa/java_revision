package java_string;

public class Main {
    public static void main(String []args){
        String greeting = "Hello"; 
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting); 
        
        String txt = "Hello I am Mohammad Faqusa"; 
        System.out.println(txt.indexOf("am")); 
        
        
        // Numbers and Strings 
        
        String x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String)
        System.out.println(z); 
        
        
        System.out.println("Hello I am\bMohammad\rFaqusa"); 
        System.out.println("Hello I am Mohammad\fFaqusa"); 

    }
}
