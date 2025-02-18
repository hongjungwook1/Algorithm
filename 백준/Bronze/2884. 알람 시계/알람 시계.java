import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt() - 45;

        if (minute < 0) {
            minute = minute + 60;
            hour = hour - 1;
            if (hour < 0) {
                hour = hour + 24;
            }
        }
        System.out.println(hour + " " + minute);
    }
}
