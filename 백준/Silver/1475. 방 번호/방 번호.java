import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.next();

        int[] count = new int[10];

        for (char c : number.toCharArray()) {
            count[c - '0']++;
        }

        count[6] = (count[6] + count[9] + 1) / 2;
        count[9] = 0;

        int max = Arrays.stream(count).max().orElse(0);

        System.out.println(max);
    }
}