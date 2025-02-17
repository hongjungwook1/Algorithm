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
        for (int i = 0; i < M; i++) {
            if (setN.contains(scan.nextInt())) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
