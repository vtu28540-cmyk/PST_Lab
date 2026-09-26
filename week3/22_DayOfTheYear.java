import java.time.LocalDate;

public class DayOfTheYear {
    public static int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);
        return d.getDayOfYear();
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-02-10"));
    }
}
