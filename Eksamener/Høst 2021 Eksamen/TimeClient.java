import java.time.*;

public class TimeClient {
    public static void main(String[] args) {
        LocalTime time=LocalTime.parse("20:24:12");
        int minutes=time.getMinute();
        System.out.println(minutes + " minutes");
    }
}
