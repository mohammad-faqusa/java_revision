package modifiers;



abstract class Main {

    final int x = 10;
    final double PI = 3.14;
    public String fname = "John";
    public int age =24;
    public abstract void study();
    
    
    public static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects"); 

    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects"); 

    }

    // public static void main(String[] args) {
    //     System.out.println(); 
    //     Main myObjMain = new Main();
    //     // myObjMain.x = 50;
    //     // myObjMain.Pi = 25; 
    //     System.out.println(myObjMain.x); 

    //     myStaticMethod();
    //     Main myObjMain2 = new Main();
    //     myObjMain2.myPublicMethod();

    // }
    
}

class Student extends Main{
    public int graduationYear = 2018;
    public void study(){
        System.out.println("Studying all day long"); 
    }

}

public class Second{

    public static void main(String[] args) {
        System.out.println(); 
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname); ;
        System.out.println("Age : " + myObj.age); 
        System.out.println("Graduation Year: " + myObj.graduationYear); 
        myObj.study(); 
    }


}

