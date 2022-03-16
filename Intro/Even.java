import java.util.*;
class Even{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the line");
        String name="hai";
        String b=scan.nextLine();
        if(name.equals(b)){
            System.out.println("Hi"+name);
        }else{
            System.out.println("wrong");
        }
        System.out.println("Enter the number");
                int a=scan.nextInt();
        if(a%2==1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
}