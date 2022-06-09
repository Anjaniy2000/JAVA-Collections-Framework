package comparableAndComparator.comparator;


import java.util.Comparator;

public class Player{
    private String name;
    private int medals;
    private String gameName;

    public Player(String name, int medals, String gameName) {
        this.name = name;
        this.medals = medals;
        this.gameName = gameName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public String toString() {
        return "Player [Name = " + this.name + " , " + "No. Of Medals = " + this.medals + ", " + "Game Name = " + this.gameName + "]";
    }

    static class sortByNameThenMedals implements Comparator<Player>{

        @Override
        public int compare(Player o1, Player o2) {
            if(o1.name.equals(o2.name)){
                return o1.medals - o2.medals;
            }
            else{
                return o1.name.compareTo(o2.name);
            }
        }
    }
}


