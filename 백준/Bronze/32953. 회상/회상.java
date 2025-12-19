import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, Integer> students = new HashMap<>();
        int N = scan.nextInt();
        int M = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int K = scan.nextInt();
            for (int j = 0; j < K; j++) {
                int student = scan.nextInt();
                students.put(student, students.getOrDefault(student, 0) + 1);
            }
        }

        Long result = students.entrySet().stream()
                .filter(x -> x.getValue() >= M)
                .count();

        System.out.println(result);
    }
}