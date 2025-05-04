class QuickStart {
    String name;

    QuickStart(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("Hello World!");
        QuickStart obj = new QuickStart("Mohammad");
        System.out.println(obj.name);
    }
}
