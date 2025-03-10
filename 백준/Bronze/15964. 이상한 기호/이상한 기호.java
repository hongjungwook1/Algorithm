import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long N = scan.nextInt();
        long M = scan.nextInt();

        long result = (N + M) * (N - M);
        System.out.println(result);
    }
}