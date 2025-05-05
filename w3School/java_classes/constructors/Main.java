package constructors;

public class Main {
    int x; 

    public Main() {
        x = 5;
    }

    public Main(int y) {
        x = y; 
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Main obj2 = new Main(10);

        System.out.println(obj2.x); 
        

    }


}
