class Class3{
    public static void main(String[] args) {
        Animal obj=new Animal(4);
        System.out.println(obj.no_animals);
        System.out.println(obj.getName());
        obj.setName();
        System.out.println(obj.getName());
        System.out.println(obj.getAnimal());
        obj.setAnimal();
        System.out.println(obj.getAnimal());


    }
}
class Animal{
    private String name="Lion";
    int no_animals;
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = "Cat";
    }

    public String getAnimal(){
        return name;
    }

    public void setAnimal(){
        this.name = "Dog";
    }

    public Animal(int no_animals) {
        this.no_animals=no_animals;
    }
}