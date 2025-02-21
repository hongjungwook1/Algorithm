import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long N = scan.nextLong();
        Map<Long, Integer> numbers = new HashMap<>();
        List<Long> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            long number = scan.nextLong();
            numbers.put(number, numbers.getOrDefault(number, 0) + 1);
        }

        int max = numbers.values().stream().mapToInt(x -> x).max().orElse(0);

        for (Map.Entry<Long, Integer> number : numbers.entrySet()) {
            if (number.getValue().equals(max)) {
                result.add(number.getKey());
            }
        }
        Collections.sort(result);
        System.out.println(result.get(0));
    }
}