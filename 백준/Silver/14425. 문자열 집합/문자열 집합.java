import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int result = 0;

        Map<String, Integer> wordMaps = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = scan.next();
            wordMaps.put(word, i);
        }

        for (int i = 0; i < M; i++) {
            String word = scan.next();
            if (wordMaps.containsKey(word)) result++;
        }
        System.out.println(result);
    }
}