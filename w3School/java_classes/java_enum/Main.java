package java_enum;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main {
    
    
    public static void main(String[] args) {
        
        Level obj = Level.HIGH;
        System.out.println(obj); 

        switch (obj) {
            case LOW:
                System.out.println("Low Level"); 
                break;
            case MEDIUM:
                System.out.println("medium Level"); 
                break;
            case HIGH:
                System.out.println("high Level"); 
                break;
        
            default:
                break;
        }

        //loop through enum
        for (Level myVar : Level.values()) {
            System.out.println(myVar); 
        }
    }

}
