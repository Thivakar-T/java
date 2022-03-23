class Static{
    public static void main(String[] args) {
        System.out.println(State.country);
        State obj=new State("AUS");
        System.out.println(obj.country);
    }
}
class State{
    public final static String country="India";
    State(String country){
//        this.country=country;
    }
}