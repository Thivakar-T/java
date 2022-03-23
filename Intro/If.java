import java.util.*;
class If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day");
        System.out.println("Enter today");
        String today = scan.nextLine();
//        System.out.println("Enter next");
//        String next=scan.nextLine();
        if (today.equals("Sunday")) {
            System.out.println("This is Sunday");
        } else if (today.equals("Monday")) {
            System.out.println("This is Monday");
        } else if (today.equals("Tuesday")) {
            System.out.println("This is Tuesday");
        } else if (today.equals("WedNesday")) {
            System.out.println("This is WedNesday");
        } else if (today.equals("Thursday")) {
            System.out.println("This is Thursday");
        } else if (today.equals("Friday")) {
            System.out.println("This is Friday");
        } else if (today.equals("Saturday")) {
            System.out.println("This is Saturday");
        } else {
            System.out.println("Exit");
        }
    }
}