import java.util.*;
class Methods{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int z=5;
        int c=add(a,b,z);
        System.out.println(c);
    }
    public static int add(int num1,int num2,int z){
        return num1+num2+z;
    }
}