package enums;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        for(Seasons season : Seasons.values()){
            System.out.println(season);
        }


        System.out.println(Arrays.toString(Seasons.values()));

        System.out.println(Seasons.valueOf("WINTER"));
    }
}
