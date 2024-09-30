package bank;
import java.util.Date;
public class DateTest {
    public static void main(String[] args) {

        long[] times = {10000, 100000, 1000000, 10000000, 100000000, 1000000000L, 10000000000L, 100000000000L};

        for (long time : times) {
            Date date = new Date();
            date.setTime(time);
            System.out.println("Elapsed time: " + time + " milliseconds");
            System.out.println("Date and time: " + date.toString());
            System.out.println();
        }

    }

}
