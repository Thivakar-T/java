import java.util.*;
class Method{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String[] cars={"volvo","BMW","tata","volvo","BMW","tata","BMW","Audi","tata"};
//        System.out.println("Enter car1 name");
//        String n=scan.nextLine();
//        int a=list(cars,n);
//        System.out.println(a);
//        System.out.println("Enter car2 name");
//        String b=scan.nextLine();
//        int c=list(cars,b);
//        System.out.println(c);
        System.out.println("enter the value");
        int x=scan.nextInt();
        boolean m=name(x);
        System.out.println(m);
    }
    public static int list(String[] cars,String n){
        int count=0;
        for(int i=0;i<cars.length;i++){
            if(cars[i].equals(n)){
             count++;
            }
        }
        return count;
    }
    public static boolean name(int x){
        boolean z=false;
        for(int i=2;i<x;i++) {
            if (x%i == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}