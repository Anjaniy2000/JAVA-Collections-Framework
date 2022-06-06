package enums.season;

import enums.season.Season;

public class SeasonRunner {
    public static void main(String[] args) {

        //values():
        for (Season season :
                Season.values()) {
            System.out.println(season);
        }

        //ordinal(){0-based indexing}:
        Season season = Season.SPRING;
        System.out.println(season.ordinal());

        //valueOf():
        System.out.println(Season.valueOf("FALL"));


        //way of storing the enums in database(with the help of index){custom indexing}:
        Season currentseason = Season.SUMMER;
        System.out.println(currentseason.getIndex());

        Season nextseason = Season.MONSOON;
        System.out.println(nextseason.ordinal());
    }
}
