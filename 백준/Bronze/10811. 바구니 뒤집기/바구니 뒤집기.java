import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arrN = new int[N];

        for (int i = 0; i < N; i++) {
            arrN[i] = (i + 1);
        }

        for (int i = 0; i < M; i++) {
            int first = scan.nextInt() - 1;
            int second = scan.nextInt() - 1;
            while (first < second) {
                int temp = arrN[first];
                arrN[first++] = arrN[second];
                arrN[second--] = temp;
            }
        }
        for (int i : arrN) {
            System.out.print(i + " ");
        }
    }
}