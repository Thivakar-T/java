import java.util.*;
class Car {
    int no_of_tires;
    String fuel_type;
    boolean have_ac=false;

    Car (int no_of_tires, String fuel_type) {
        this.no_of_tires =no_of_tires;
        this.fuel_type = fuel_type;
    }
}
    class ClassExample{
        public static void main(String args[]){
            Car obj1=new Car(4,"petrol");
            System.out.println(obj1.no_of_tires);
            System.out.println(obj1.fuel_type);
            System.out.println(obj1.have_ac);
            Car obj2=new Car(4,"deisel");
            System.out.println(obj2.no_of_tires);
            System.out.println(obj2.fuel_type);
            System.out.println(obj2.have_ac);

        }
    }