import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            List<Integer> numList = new ArrayList<>();

            for (int j = 0; j < 10; j++) {
                numList.add(scan.nextInt());
            }
            Collections.sort(numList);
            System.out.println(numList.get(7));
        }
    }
}