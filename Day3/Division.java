import java.util.*;
class Division{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1= scan.nextInt();
        System.out.println("Enter the num2");
        int num2= scan.nextInt();
        int quotient=num1/num2;
        int remainder=num1%num2;
        System.out.println("The result quotient is"+ quotient);
        System.out.println("The result remainder is "+ remainder);
    }
}