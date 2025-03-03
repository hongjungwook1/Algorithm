import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int result = (int) Math.pow(2, N) + 1;

        System.out.println(result * result);
    }
}