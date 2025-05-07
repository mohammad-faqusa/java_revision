import java.util.Set;
import java.util.Arrays; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.lang.StringBuilder; 
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        {
        char[] str = "education".toCharArray(); 
        for (char c : str) {
            c = 'i';
        }
        for (char c : str) {
            System.out.println(c); 
        }


        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u'); 


        int sum = 0 ; 

        for (char c : str) {
            if(vowels.contains(c)) sum += 1; 
        }
        System.out.println(); 
        System.out.println(sum); 

        String str1 = " java hello world"; 
        str1 = str1.trim(); 
        String[] str1arr = str1.split("\\s+"); 

        Arrays.sort(str1arr, (obj1 , obj2)-> {
            String a = (String) obj1; 
            String b = (String) obj2; 

            return  a.compareTo(b); 
            
        });
        
        for (String string : str1arr) {
            System.out.println(string); 
        }
        String str2 = String.join(" ");
        System.out.println(str2); 
        }
        
    

        {
        String sentence1 = "java is great and java is powerful";
        HashMap<String, Integer> obj = new HashMap<String, Integer>();
        String[] setnArrStrings = sentence1.trim().split("\\s"); 
        
        for (String string : setnArrStrings) {
            if(obj.containsKey(string)){
                obj.put(string, obj.get(string)+1);
            } else {
                obj.put(string, 1);
            }
        }
        for (Integer i : obj.values()) {
            System.out.println(i); 
        }

        for (HashMap.Entry<String, Integer> entry : obj.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        }

        }

        {
            HashMap<Integer, Integer> obj = new HashMap<Integer, Integer>();

            int[] nums = {2, 7, 11, 15};
            int target = 9;
            boolean found = false;  
            int[] result = new int[2]; 
            
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if(nums[i] + nums[j] == target) {
                        found = true;
                        result[0] = nums[i];
                        result[1] = nums[j];
                        break; 

                    }
                }
                
            }
            if(found){
                System.out.println("the target is found : " +  target + " with result : " + result[0] + " " + result[1]); 
            }

        }
        {
            int[] nums = {2, 7, 11, 15};
            int target = 9;

            HashMap<Integer,Integer> obj = new HashMap<Integer,Integer>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i]; 

                if(obj.containsKey(complement)) {
                    System.out.println("found the pair of numbers : " + nums[i] + "at index : " + i +  " " + nums[obj.get(complement)] + " at index : " + obj.get(complement) + " " + " to equal target : " + target);
                    break;  
                }
                obj.put(nums[i], i); 

            }
        }


        {
            Student std1 = new Student("mohammad", 1, 90); 
            System.out.println(std1.isPass()? "is passed " : "not passed!"); 
            std1.displayInfo();

            ArrayList<Student> students = new ArrayList<Student>();

            for (int i = 0; i < 5 ; i++) {
                students.add(new Student("student " + i, i, (float)(Math.random()*100)));

            }
            for (Student student : students) {
                student.displayInfo();
            }

            Collections.sort(students, (obj1, obj2)-> {
                if(obj1.getGrade() < obj2.getGrade()) return -1; 
                if(obj1.getGrade() > obj2.getGrade()) return 1; 
                return 0;  
            });

            for (Student student : students) {
                student.displayInfo();
            }




        }
        {
            String input = "(()())";
            System.out.println("Is valid? " + isValid(input));

        }

        {
            Queue<Character> queue = new LinkedList<Character>();
            Map<Character, Integer> freq = new HashMap<Character, Integer>(); 
            StringBuilder result = new StringBuilder(); 
    
            String str = "aabccxbddex"; 
    
            for (char ch : str.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                queue.offer(ch); 
    
                while(!queue.isEmpty() && freq.get(queue.peek()) > 1){
                    queue.poll();
                }
    
                if(queue.isEmpty()){
                    result.append('#');
                } else {
                    result.append(queue.peek()); 
                }
            }
    
            System.out.println(str); 
            System.out.println(result.toString()); 
    
    
        }
        {
            System.out.println(evaluate("2*3+3*3"));
        }
        {
            String input = "programming";
            Map<Character, Integer>  obj = new LinkedHashMap<>();

            for (int i = 0; i  < input.length(); i++) {
                obj.put(input.charAt(i), obj.getOrDefault(input.charAt(i), 0) + 1);

            }

            for (char m : obj.keySet()) {
                System.out.println(m); 
            }
        }
        
    }

    public static int evaluate(String str) {

        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char prevOp = '+'; 


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                System.out.println(num); 
            }

            if(!Character.isDigit(ch) || i == str.length() - 1){
                System.out.println(ch); 
                if(prevOp == '+'){
                    stack.push(num); 
                } else if (prevOp == '-') {
                    stack.push(-num); 
                    
                } else if (prevOp == '*') {
                    stack.push(stack.pop() * num); 
                        
                } else if (prevOp == '/') {
                    stack.push(stack.pop() / num);
                }

                prevOp = ch; 
                num = 0 ; 
            }

            {
                Set<Integer> obj = new HashSet<Integer>();
                int[] nums = {4, 5, 4, 2, 5, 1, 2, 3};

                
            }

            
        }
        int result = 0;
        for (int val : stack) result += val;
        return result;
    }
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        if(str.equals("")) return false;
        String brackets = ""; 
        if(str.charAt(0) == '(') brackets = "()";
        if(str.charAt(0) == '{') brackets = "{}";
        if(str.charAt(0) == '[') brackets = "[]";
        for (char ch : str.toCharArray()) {
            if (ch == brackets.charAt(0)) {
                stack.push(ch);
            } else if (ch == brackets.charAt(0)) {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    
}

class Student {
    private String name; 
    private int id; 
    private float grade; 

    public Student(String n, int i, float g){ 
        name = n;
        id = i;
        grade = g; 
    }

    public float getGrade(){
        return grade; 
    }

    public boolean isPass() {
        return grade >= 50; 
    }

    public void displayInfo(){
        System.out.println("name : " + name + " id : " + id + " grade : " + grade); 
    }
}