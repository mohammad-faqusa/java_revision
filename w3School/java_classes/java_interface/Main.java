package java_interface;

interface Animal {
    final int x = 10;

    public void animalSound(); 
    public void run(); 

}

interface SecondInterface {

    public abstract void myOtherMethod();
}

class Pig implements Animal, SecondInterface {
    
    public void animalSound() {
        System.out.println("Wee wee"); 

    }
    public void run() {
        System.out.println("run run"); 
    }
    public void myOtherMethod() {
        System.out.println("this my other method"); 
    }
    
}

public class Main {
    public static void main(String[] args) {
        Pig objPig = new Pig();
        System.out.println(); 
        System.out.println(objPig.x); 
        System.out.println(Animal.x); 
        System.out.println(objPig.x); 
        objPig.myOtherMethod();
        

    }
}
