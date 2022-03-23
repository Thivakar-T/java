import java.util.*;
class MethodOne {
    public static void main(String[] args) {
        list();
    }
     static void list(){
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the value");
        int x=scan.nextInt();
        if(x%2==0){
           System.out.println("The number is odd ");
        }
       else {
           System.out.println("The number is even ");
       }
    }
}
