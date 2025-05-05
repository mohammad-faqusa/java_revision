package recursion;

public class Main {
    public static void main(String[] args) {
        int reuslt = sum(10);
        System.out.println(reuslt); 
    }

    public static int sum(int k) {
        if (k>0) {
            return k + sum(k - 1);
        } else {
            return 0; 
        }
    }
    public static int sum(int start, int end) {
        if (start > end) {
            return end + sum(start, end - 1);
        } else {
            return end; 
        }
    }
}
