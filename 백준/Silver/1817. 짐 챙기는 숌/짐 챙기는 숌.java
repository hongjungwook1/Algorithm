import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] books = new int[N];

        for (int i = 0; i < N; i++) {
            books[i] = scan.nextInt();
        }

        int sum = 0;
        int count = 1;

        for (int i = 0; i < N; i++) {
            sum += books[i];
            if (sum > M) {
                count++;
                sum = books[i];
            }
        }
        if (N == 0) {
            System.out.println(0);
        } else {
            System.out.println(count);    
        }
    }
}