import java.util.*;
class IfFor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Starting point");
        int a= scan.nextInt();
        System.out.println("Enter Ending point");
        int b= scan.nextInt();
        System.out.println("Enter  divider");
        int c= scan.nextInt();
        for(int i=a;i<=b;i++){
            if(i%c==0){
                System.out.println(i);
            }
        }
    }
}