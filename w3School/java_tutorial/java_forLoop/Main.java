package java_forLoop;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 0; i <= 2; i++) {
            System.out.println("Outer: " + i); //executes 2 times

            //Inner loop
            for (int j = 1; j <=3; j++) {
                System.out.println("Inner : " + j); 
            }
        }

        String[] cars= {"BMW", "Marcidies", "volvo", "hundai"};

        for (String i : cars) {
            System.out.println(i);

        }

        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);

        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; 
            }
            System.out.println(i);

        }

        {
            int i = 0; 
            while (i < 10) {
                System.out.println(i); 
                i++;
                if (i == 4) {
                    break; 
                }
            }
        }

        {
            int i = 0;
            while (i < 10) {
                if (i == 4) {
                    i++;
                    continue; 
                }
                System.out.println(i);
                i++; 
            }
        }

        

        
    }
}
