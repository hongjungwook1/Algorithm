import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] arrN = new int[N];
        for (int i = 0; i < N; i++) {
            arrN[i] = scan.nextInt();
        }

        Arrays.sort(arrN);

        int sum = 0;
        int tempN = N;
        for (int i = 1; i <= N; i++) {
            if (tempN == 0) break;
            sum += arrN[i - 1] * tempN;
            tempN -= 1;
        }
        System.out.println(sum);
    }
}
