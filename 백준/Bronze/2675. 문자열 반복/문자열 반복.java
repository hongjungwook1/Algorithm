import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int count = scan.nextInt();
            String word = scan.next();
            String[] arr = word.split("");

            for (int j = 0; j < arr.length; j++) {
                String result = arr[j].trim();
                System.out.print(result.repeat(count));
            }
            System.out.println();
        }
    }
}
