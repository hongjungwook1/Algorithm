import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        Set<String> setN = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            setN.add(scan.next());
        }

        for (int i = 0; i < M; i++) {
            String name = scan.next();
            if (setN.contains(name)) {
                result.add(name);
            }
        }
        System.out.println(result.size());
        result.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
