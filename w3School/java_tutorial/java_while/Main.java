package java_while;

public class Main {
    public static void main(String[] args) {
        int i = 0; 
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do while 

        int countDown = 3; 

        while (countDown > 0) {
            System.out.println(countDown);
            countDown--;
        }

        int dice = 1;

        while (dice < 6) {
            if (dice < 6) {
                System.out.println("No yatzy"); 
            } else {
                System.out.println("Yatzy");
            }
            dice = dice + 1; 
            
        }
        
    }
    
}
