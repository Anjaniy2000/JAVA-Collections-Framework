package comparableAndComparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        //Players:
        List<Player> players = new ArrayList<>();
        players.add(new Player("Rohit",2, "Football"));
        players.add(new Player("Jay",1, "Cricket"));
        players.add(new Player("Mahesh",4, "Basketball"));
        players.add(new Player("Adams",2, "Baseball"));
        players.add(new Player("Adams",5, "Baseball"));
        System.out.println("Before Sorting:");
        players.forEach(System.out::println);

        System.out.println("After Sorting:");
//        System.out.println("Sort By Name Then No. Of Medals:");
//        Collections.sort(players, new Player.sortByNameThenMedals());
//        players.forEach(System.out::println);

//        System.out.println("Sort By Game Name:");
//        Collections.sort(players, new Player.sortByGameName());
//        players.forEach(System.out::println);

        /* Enhanced Comparator Using Lambda Expression: */
        //Sort By Name -> Game Name -> No. Of Medals:
        Collections.sort(players, Comparator.comparing(Player::getName).thenComparing(Player::getGameName).thenComparing(Player::getMedals));
        players.forEach(System.out::println);

        /* Reversing The Sorting: */
        System.out.println("Reversing The Sorting:");
        Collections.sort(players, Comparator.comparing(Player::getName).thenComparing(Player::getGameName).thenComparing(Player::getMedals).reversed());
        players.forEach(System.out::println);


    }
}
