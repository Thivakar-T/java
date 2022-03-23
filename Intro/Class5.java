class Class5{
    public static void main(String[] args) {
        Shop obj=new Shop("OnTea");
        System.out.println(obj.shop_name);
        System.out.println(obj.getNo_of_rooms());
        obj.setNo_of_rooms(5);
        System.out.println(obj.getNo_of_rooms());
    }
}
class Shop{
    private int no_of_rooms;
    public String shop_name;
    public double getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(int no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }
    Shop(String shop_name){
        this.shop_name=shop_name;
    }
}