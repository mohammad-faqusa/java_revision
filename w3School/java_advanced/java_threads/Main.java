package java_threads;

// public class Main extends Thread {
   
//     public void run() {
//         System.out.println("This code is running in a thread"); 
     
//     }

//     public static void main(String[] args) {
        
//     }
// }
public class Main implements Runnable {

    public static int amount = 0; 
   
    public void run() {
        amount++; 
        System.out.println("This code is running in a thread"); 
     
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println(); 
        System.out.println(amount); 
        amount++;
        System.out.println(amount); 
        System.out.println("This cod is outside of the thread");
        
        OtherClass obj2Class = new OtherClass();
        obj2Class.start();
        

    }

}

class OtherClass extends Thread  {

    public void run(){
        System.out.println("this is run method thread of OtherClass"); 
    }
}
