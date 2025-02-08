import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int[] num = new int[5];
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                num[j] = scan.nextInt();
                sum += num[j];
            }
            Arrays.sort(num);

            if (num[3] - num[1] >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(sum - (num[0] + num[4]));
            }
        }
    }
}