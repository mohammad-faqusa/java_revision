package java_dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println();
        System.out.println(obj); 

        LocalTime obj2 =  LocalTime.now() ;

        System.out.println(obj2); 

        LocalDateTime obj3DateTime = LocalDateTime.now();

        System.out.println((obj3DateTime)); 

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = obj3DateTime.format(myFormatObj);

        System.out.println(formattedDate) ;
         


    }
}
