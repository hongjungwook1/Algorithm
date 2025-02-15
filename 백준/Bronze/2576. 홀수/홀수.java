import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean isOdd = false;
        for (int i = 0; i < 7; i++) {
            int num = scan.nextInt();

            if (num % 2 == 1) {
                sum += num;
                min = Math.min(min, num);
                isOdd = true;
            }
        }

        if (isOdd) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
