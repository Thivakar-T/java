class Array{
    public static void main(String[] args) {
        String[] cars={"volvo","BMW","Audi","tata"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        for(String car:cars){
            System.out.println(car);
        }
        System.out.println(cars.length);
    }
}