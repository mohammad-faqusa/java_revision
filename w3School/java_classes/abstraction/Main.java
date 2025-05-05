package abstraction;

abstract class Animal {
    public abstract void AnimalSound();
    public void sleep() {
        System.out.println("Zzz"); 
    }
}

class Pig extends Animal {

    public void AnimalSound() {
        System.out.println("Wwee Wee"); 
        
    }
}
public  class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.AnimalSound();
        myPig.sleep();
    }
}
