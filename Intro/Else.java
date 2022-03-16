import java.util.*;
class Else {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the a");
        int a= scan.nextInt();
//        System.out.println("Enter the b");
//        int b= scan.nextInt();
//        if(a<=b){
//            System.out.println("a is b");
//        }
        if(a==100){
            System.out.println("a is equal 100");
        }
        else if(a<=50){
            System.out.println("a is inside 50");
        }
        else if(a<100){
            System.out.println("a is smallerthan 100");
        }
        else{
            System.out.println("a is biggerthan 100");
        }
    }
}
