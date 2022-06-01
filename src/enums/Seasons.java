package enums;

public enum Seasons {

    WINTER(1),
    SUMMER(2),
    SPRING(3),
    FALL(4);

    private final int index;

    private Seasons(int index){
        this.index = index;
    }

    public int getIndex(){
        return this.index;
    }
}
