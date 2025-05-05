package methods;



class Main {
    public static void myMethod() {
        System.out.println("Hello World!"); 

    }

    //static vs public 
    public void thisMethod() {
        System.out.println("this is public method, it needs object to run!"); 

    }
    
}

class First{
    int x = 20;
    public void name() {
        System.out.println("This is First Class"); 
    }
}
public class Second{
    public void name() {
        System.out.println("My name is Mohammad"); 
    }
    public static void main(String[] args) {
        Main.myMethod(); 
        // thisMethod();  error, you need to create object of Main first 
        Main obj = new Main(); 
        obj.thisMethod();
        obj.myMethod(); // it is recommended to be accessed in static way 
        Second obj2 = new Second(); 
        obj2.name(); 
        
        First obj3 = new First(); 
        obj3.name(); 
        
    }
}