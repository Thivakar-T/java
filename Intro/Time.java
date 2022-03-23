import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
class Time{
    public static void main(String[] args) {
        time();
//        //Displaying current date and time in 12 hour format with AM/PM
//        DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
//        String dateString2 = dateFormat2.format(new Date()).toString();
//        System.out.println("Current date and time in AM/PM: "+dateString2);
    }
    public static void time(){
        DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
        String dateString = dateFormat.format(new Date()).toString();
        System.out.println("Current time in AM/PM: "+dateString);

    }
}
