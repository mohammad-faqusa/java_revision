package scope;

public class Main {
    public static void main(String[] args) {
        
        int x = 100; 

        System.out.println(x); 

        //block scope 

        {
            int y = 20; 
            System.out.println(y);

        }
        // System.out.println(y);error 
        

    }
}
