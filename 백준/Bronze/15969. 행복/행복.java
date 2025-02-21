import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> score = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            score.add(scan.nextInt());
        }

        int max = score.stream().mapToInt((x) -> x).max().orElse(0);
        int min = score.stream().mapToInt((x) -> x).min().orElse(0);

        System.out.println(max - min);
    }
}