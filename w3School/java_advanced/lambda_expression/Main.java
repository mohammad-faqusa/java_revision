package lambda_expression;
import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str); 
}

public class Main {
    
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        


        cars.forEach((n)->System.out.println(n));

        Consumer<String> method = (n) -> {System.out.println(n); };
        cars.forEach(method);

        StringFunction exclaim = (s) -> s + "!"; 
        StringFunction ask = (s) -> s + "?"; 

        cars.forEach((n) -> printFormatted(n, exclaim));

        System.out.println(cars); 

    }

    public static void printFormatted(String str, StringFunction format) {
        // TODO: implement logic here
        String result = format.run(str);
        System.out.println(result); 
    }
}
