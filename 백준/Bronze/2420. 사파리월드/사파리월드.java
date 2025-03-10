import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long N = scan.nextInt();
        long M = scan.nextInt();

        System.out.println(Math.abs(N - M));
    }
}