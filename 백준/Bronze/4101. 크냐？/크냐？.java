import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = scan.nextInt();
            int M = scan.nextInt();

            if (N == 0 && M == 0) break;

            if (N > M) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }
        System.out.println(sb);
    }
}
