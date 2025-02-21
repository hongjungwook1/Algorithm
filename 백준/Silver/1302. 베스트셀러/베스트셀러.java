import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        Map<String, Integer> best = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = scan.next();
            best.put(book, best.getOrDefault(book, 0) + 1);
        }

        int max = best.values().stream().mapToInt(x -> x).max().orElse(0);
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : best.entrySet()) {
            if (entry.getValue().equals(max)) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        System.out.println(result.get(0));
    }
}