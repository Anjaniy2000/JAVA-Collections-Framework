package comparableAndComparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        //Players:
        List<Player> players = new ArrayList<>();
        players.add(new Player("Rohit",2, "Football"));
        players.add(new Player("Jay",1, "Cricket"));
        players.add(new Player("Mahesh",4, "Basketball"));
        players.add(new Player("Adams",2, "Baseball"));
        players.add(new Player("Adams",5, "Running"));
        System.out.println("Before Sorting:");
        players.forEach(System.out::println);

        System.out.println("After Sorting:");
        Collections.sort(players, new Player.sortByNameThenMedals());
        players.forEach(System.out::println);

    }
}
