package encapsulation;

class Person {
    private String name;

    private int age;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name; 
    }
    public Person(String name, int age) {
        this.name = name; 
        this.name = name;
    }

}

public class Main{
    public static void main(String[] args) {
        Person obj = new Person("Mohammad");
        // obj.name = "Mohammad" // error
        System.out.println(); 
        System.out.println(obj.getName()); 

        obj.setAge(20);
        System.out.println(obj.getAge()); 
        
    }
}