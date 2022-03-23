class PublicFinal{
    public static void main(String[] args) {
        Sports obj=new Sports("India",5);
        System.out.println(" Team Name"+" "+obj.teamName);
        System.out.println("Player Name"+" "+obj.getPlayer());
        obj.setPlayer("Hitman");
        System.out.println("Nick Name"+" "+obj.getPlayer());
        System.out.println("Old Jersy Number"+" "+obj.getJersyNumber());
        obj.setJersyNumber(45);
        System.out.println("New Jersy Number"+" "+obj.getJersyNumber());
        System.out.println("Odi rank"+" "+obj.getOdiRank());
        System.out.println("Test rank"+" "+obj.testRank);
        System.out.println("T20 rank"+" "+obj.getT20Rank());
    }
}
class Sports{
    public String teamName;
    public String player="Rohit";
    private int jersyNumber=1;
    public final int odiRank=2;
    public final int testRank=8;
    private final int t20Rank=4;

    public int getT20Rank() {
        return t20Rank;
    }
//    public void setT20Rank(int t20Rank) {
//        this.t20Rank = t20Rank;
//    }
    public int getOdiRank() {
        return odiRank;
    }
//    public void setOdiRank(int odiRank) {
//        this.odiRank = odiRank;
//    }

    public int getJersyNumber() {
        return jersyNumber;
    }

    public void setJersyNumber(int jersyNumber) {
        this.jersyNumber = jersyNumber;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    Sports(String teamName,int testRank){
        this.teamName=teamName;
//        this.testRank=testRank;
    }
}