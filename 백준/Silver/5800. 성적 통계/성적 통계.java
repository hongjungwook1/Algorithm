import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();


        for (int i = 1; i <= N; i++) {
            int M = scan.nextInt();
            List<Integer> numbers = new ArrayList<>();

            for (int j = 0; j < M; j++) {
                numbers.add(scan.nextInt());
            }
            numbers.sort(Collections.reverseOrder());
            int max = numbers.get(0);
            int min = numbers.get(numbers.size() - 1);

            int gap = 0;
            for (int k = 0; k < M - 1; k++) {
                gap = Math.max(gap, numbers.get(k) - numbers.get(k + 1));
            }
            System.out.println("Class " + i);
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);
        }
    }
}