import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            String words = scan.nextLine();

            String result = words.substring(0, 1).toUpperCase();
            result += words.substring(1);
            System.out.println(result);
        }
    }
}