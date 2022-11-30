public class week5_3 {
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    public static void main(String args[]) {
        Day day = Day.SATURDAY;
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Будний день");
            case SATURDAY, SUNDAY -> System.out.println("Выходной день");
        }
    }
}
