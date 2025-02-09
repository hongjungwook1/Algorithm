import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] N = scan.next().split("");
        List<String> result = new ArrayList<>(Arrays.asList(N));

        result.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }
}
