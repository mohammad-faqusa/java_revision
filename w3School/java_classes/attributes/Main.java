package attributes;

public class Main {
    int x = 5;
    int y = 3; 
    final int z = 10; 
    public static void main(String[] args) {
        Main obj1 = new Main(); 
        System.out.println(obj1.x + obj1.y); 
        obj1.x = 40;
        System.out.println(obj1.x); 

        System.out.println(obj1.z); 
        System.out.println("chenging the value of z"); 
        // obj1.z = 15;// error 

    }
}
