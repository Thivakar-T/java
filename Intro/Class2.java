class Class2{
    public static void main(String[] args) {
        Employee obj1=new Employee("Ford");
        System.out.println(obj1.companyName);
        System.out.println(obj1.getNo_of_workers());
        obj1.setNo_of_workers();
        System.out.println(obj1.getNo_of_workers());
        System.out.println(obj1.isAttendence());
        obj1.setAttendence();
        System.out.println(obj1.isAttendence());

    }
}
class Employee{
    private int no_of_workers=5;

    public int getNo_of_workers() {
        return no_of_workers;
    }

    public void setNo_of_workers() {
        this.no_of_workers=10;
    }

    String companyName;
    private boolean attendence=false;

    public boolean isAttendence() {
        return attendence;
    }

    public void setAttendence( ) {
        this.attendence = true;
    }
    Employee ( String name) {
        this.companyName = name;
    }
}