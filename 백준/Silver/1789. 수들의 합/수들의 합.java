import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long N = scan.nextLong();
        long sum = 0;
        long count = 0;

        for (int i = 1; i <= N; i++) {
            if (sum > N) {
                break;
            }
            sum += i;
            count++;
        }

        if (count == 0 || count == 1) {
            System.out.println(1);
        } else {
            System.out.println(count - 1);
        }
    }
}