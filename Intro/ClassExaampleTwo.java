class ClassExaampleTwo{
public static void main(String[]args){
        Student obj1=new Student(4,"petrol");
        System.out.println(obj1.no_of_sub);
        System.out.println(obj1.name);
        System.out.println(obj1.isHave_ac());
        obj1.setHave_ac();
        System.out.println(obj1.isHave_ac());
        }
}
class Student{
         int no_of_sub;
         String name;
        private boolean have_ac=false;
        public boolean isHave_ac() {
                return have_ac;
        }
        public void setHave_ac() {
                this.have_ac = true;
        }
        Student (int no_of_sub, String name) {
                this.no_of_sub =no_of_sub;
                this.name = name;
        }
}