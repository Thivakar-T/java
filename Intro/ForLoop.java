import java.util.*;
class ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Starting point");
        int a= scan.nextInt();
        System.out.println("Enter Ending point");
        int b= scan.nextInt();
        for(int i=a;i<=b;++i){
            System.out.println(i);
        }
    }
}
