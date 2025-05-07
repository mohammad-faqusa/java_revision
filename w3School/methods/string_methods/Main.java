public class Main {
    // TODO: add fields and methods
    

    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("this is the text length : " + txt.length()); 

        System.out.println("this is char at : " + txt.charAt(5)); 
        
        String txt1 = txt.substring(0, 10);

        System.out.println("this is first sub of txt " + txt1); 


        if(txt.contains("WXY")){
            System.out.println("found WXY at : " + txt.indexOf("WXY")); 
        }

        // equals(), equalIgnoreCase(); 

        if("Mohammad".equalsIgnoreCase("mohammad")){
            System.out.println("Both name are equal"); 

        }

        String wxy = "WXYWXYWXYWXYWXYWXYWXY";

        String www = wxy.replace("WXY", "WWW");

        System.out.println(www); 

        String spaces = "Hello            Mohammad   Khaled"; 
        String[] spacesArr = spaces.split("\\s+"); 

        for (String string : spacesArr) {
            System.out.println(string); 
        }


    }
}