import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        List<Integer> scores = new ArrayList<>();
        
        for (int i = 0; i < count; i++) {
            int score = scan.nextInt();
            scores.add(score);
        }
        int max = scores.stream().max(Integer::compareTo).orElse(0);
        double result = scores.stream().mapToDouble((score) -> (double) score / max * 100).sum();

        System.out.println(result / count);
    }
}
