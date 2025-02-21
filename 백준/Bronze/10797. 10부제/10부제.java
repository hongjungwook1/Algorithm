import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt() % 10;
            if (num == day) {
                count++;
            }
        }
        System.out.println(count);
    }
}