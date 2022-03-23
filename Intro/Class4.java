class Class4{
    public static void main(String[] args) {
        Appartment obj=new Appartment();
        System.out.println(obj.getNo_of_rooms());
        obj.setNo_of_rooms(5);
        System.out.println(obj.getNo_of_rooms());
    }
}
class Appartment{
    private double no_of_rooms;
    public String room_type="Single";
    public double getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(double no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }
}