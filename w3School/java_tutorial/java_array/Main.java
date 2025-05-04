package java_array;

public class Main {
    public static void main(String[] args) {
        String[] cars= {"Volvo", "BMW", "Ford", "Mazda"};

        int[] myNum = {10, 20, 30, 40};

        for (int i = 0; i < myNum.length; i++) {
            System.out.println(myNum[i]);
        
        }
        
        for (int i : myNum) {
            System.out.println(i);
        }

        
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i); 

        }

        // Real Life Example 
        int[] ages = {20, 22, 18, 48, 26, 87, 70};

        float avg, sum = 0; 
        System.out.println("the sum is : " + sum); 

        int length = ages.length;

        for (int i : ages) {
            sum += i; 
        }

        int lowestAge = ages[0];

        for (int i : ages) {
            if (lowestAge > i) {
                lowestAge = i;  
            }
        }

        int[][] myNumbers = {
            {1, 2, 3, 4},
            {5, 6, 7}
        };

        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

    }
}
