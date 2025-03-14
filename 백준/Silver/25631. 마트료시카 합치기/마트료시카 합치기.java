import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();
            numbers.put(number, numbers.getOrDefault(number, 0) + 1);
        }
        int max = numbers.values().stream().mapToInt(x -> x).max().orElse(0);
        System.out.println(max);
    }
}