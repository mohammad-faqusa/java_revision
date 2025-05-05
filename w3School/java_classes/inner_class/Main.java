package inner_class;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
        public int myInnerMthod() {
            return x; 
        }
    }

    private class PrivateInnerClass {
        int y = 10; 
    }

    static class SInnerClass {
        int y = 5; 
    }

    
}

public class Main {

    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass obj = myOuterClass.new InnerClass();
        System.out.println(obj.myInnerMthod()); // access the outer class from the inner class 
        OuterClass.SInnerClass obj2Class = new OuterClass.SInnerClass();
    }
}
