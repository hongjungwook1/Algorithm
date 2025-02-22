import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt();

        for (int i = 0; i < C; i++) {
            int N = scan.nextInt();

            double avg = 0.0;
            List<Double> scores = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                double score = scan.nextDouble();
                avg += score;
                scores.add(score);
            }
            double avgResult = avg / N;

            long count = scores.stream()
                    .mapToDouble(x -> x)
                    .filter(score -> score > avgResult)
                    .count();

            double result = (double) count / N * 100;
            System.out.println(String.format("%.3f", result) + "%");
        }
    }
}