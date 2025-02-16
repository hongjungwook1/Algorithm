import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int N = scan.nextInt();

            int total = 0;
            double totalGradePoints = 0.0;
            for (int j = 0; j < N; j++) {
                int score = scan.nextInt();
                double grade = scan.nextDouble();
                
                total += score;
                totalGradePoints += score * grade;
            }
            System.out.printf("%d %.1f\n", total, totalGradePoints / total);
        }
    }
}
