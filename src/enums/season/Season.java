package enums.season;

public enum Season {
    WINTER(1),
    SUMMER(2),
    SPRING(3),
    FALL(4),
    MONSOON(5);

    private int index;

    private Season(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
