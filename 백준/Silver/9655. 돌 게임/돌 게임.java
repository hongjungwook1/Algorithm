import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        System.out.println(N % 2 == 0 ? "CY" : "SK");
    }
}