import java.time.LocalDate;

public class DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31, 8, 2019));
    }
}
