import java.util.*;
class WhileScan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Starting point");
        int i= scan.nextInt();
        System.out.println("Enter Ending point");
        int a= scan.nextInt();
        System.out.println("Enter Divider");
        int b= scan.nextInt();
        while(i<=a){
           if(i%b==0){
               System.out.println(i);
           }
            i++;
        }
    }
}