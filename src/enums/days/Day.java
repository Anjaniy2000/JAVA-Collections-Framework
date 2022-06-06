package enums.days;

public enum Day implements Greet{
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURADAY(6),
    SUNDAY(7);

    private int index;

    private Day(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public void greet() {
        System.out.println("Hello There, This Is Enum Of WeekDays.");
    }
}
