import java.util.*;
class MethodThree {
    static int getSquare(int x) {
     return x*x;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int x=scan.nextInt();
        for (int i = x; i <= 5; i++) {
            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
        }
    }
}