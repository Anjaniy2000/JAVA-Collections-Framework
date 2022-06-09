package comparableAndComparator.comparator;

import java.util.Comparator;

public class Player implements Comparator<Player> {
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
    public int compare(Player o1, Player o2) {
        return 0;
    }
}
