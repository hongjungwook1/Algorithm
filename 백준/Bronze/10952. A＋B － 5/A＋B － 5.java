import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int N = scan.nextInt();
            int M = scan.nextInt();

            if (N == 0 && M == 0) break;

            System.out.println(N + M);
        }
    }
}