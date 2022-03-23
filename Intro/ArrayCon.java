import java.util.*;
class ArrayCon{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cars={"volvo","BMW","Audi","tata"};
        System.out.println("Enter car name");
        String n=scan.nextLine();
        int i=0;
//        for(int i=0;i<cars.length;i++){
//            if(!cars[i].equals(n)){
//                System.out.println(cars[i]);
//            }
//        }
        do{
            System.out.println(cars[i]);
//            i++;
        }
        while(cars[i].equals(n));
    }
}