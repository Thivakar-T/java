import java.util.*;
class IfCondition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the a");
        int a= scan.nextInt();
        if(a<=100){
            System.out.println("a is inside 100");
        }
        else{
            System.out.println("a is biggerthan 100");
        }
    }
}
