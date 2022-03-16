import java.util.*;
class Multiple{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1= scan.nextInt();
        System.out.println("Enter the num2");
        int num2= scan.nextInt();
        System.out.println("Enter the num3");
        int num3= scan.nextInt();
        int num4 = num1*num2*num3;
        System.out.println("The result is"+ num4);

    }
}