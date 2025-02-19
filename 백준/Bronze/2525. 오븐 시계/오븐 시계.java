import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();

        int plus = scan.nextInt() + minute;
        int minResult = plus / 60;

        hour += minResult;
        plus -= minResult * 60;

        if (hour >= 24) {
            hour -= 24;
        }
        System.out.println(hour + " " + plus);
    }
}