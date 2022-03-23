import java.util.*;
class DoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Starting point");
        int i= scan.nextInt();
        System.out.println("Enter Ending point");
        int a= scan.nextInt();
        do{
            System.out.println(i);
            i++;
        }
        while(i<a);
    }
}