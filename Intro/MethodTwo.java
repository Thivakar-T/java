import java.util.*;
class MethodTwo {
    public static void myMethod(int age) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the age");
             age=scan.nextInt();
            if (age < 18) {
                System.out.println("Access denied - You are not old enough!");
            } else {
                System.out.println("Access granted - You are old enough!");
            }
        }
        public static void main(String[] args) {
            myMethod(20);
    }
}