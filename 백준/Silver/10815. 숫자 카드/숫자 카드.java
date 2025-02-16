import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Set<Integer> setN = new HashSet<>();
        for (int i = 0; i < N; i++) {
            setN.add(scan.nextInt());
        }

        int M = scan.nextInt();
        List<Integer> resultN = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int num = scan.nextInt();

            if (setN.contains(num)) {
                resultN.add(1);
            } else {
                resultN.add(0);
            }
        }
        resultN.forEach((each) -> System.out.print(each + " "));
    }
}
