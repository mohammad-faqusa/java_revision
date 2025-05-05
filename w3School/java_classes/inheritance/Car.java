package inheritance;

class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!"); 

    }
}

// final class Vehicle { will generate error if is inherited

    
// }

public class Car extends Vehicle{
    private String modelName = "Mustange";
    
    public String getModelName() {
        return modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }



    public static void main(String[] args) {
        Car obj = new Car();
        obj.honk();
        System.out.println(obj.brand); 
    }
}
