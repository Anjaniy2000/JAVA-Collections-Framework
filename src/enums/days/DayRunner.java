package enums.days;

import enums.season.Season;

public class DayRunner {
    public static void main(String[] args) {
        //values():
        for (Day day :
                Day.values()) {
            System.out.println(day);
        }

        //ordinal(){0-based indexing}:
        Day day = Day.FRIDAY;
        System.out.println(day.ordinal());

        //valueOf():
        System.out.println(Day.valueOf("MONDAY"));


        //way of storing the enums in database(with the help of index){custom indexing}:
        Day currentday = Day.SUNDAY;
        System.out.println(currentday.getIndex());

        Day nextday = Day.MONDAY;
        System.out.println(nextday.ordinal());
    }
}
