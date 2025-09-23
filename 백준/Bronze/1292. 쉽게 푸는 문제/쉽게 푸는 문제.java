import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        List<Integer> sequence = new ArrayList<>();
        for (int i = 1; sequence.size() < B; i++) {
            for (int j = 0; j < i; j++) {
                sequence.add(i);
            }
        }

        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += sequence.get(i);
        }

        System.out.println(sum);
    }
}
