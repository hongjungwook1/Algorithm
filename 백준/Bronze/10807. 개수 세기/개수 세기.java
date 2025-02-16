import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scan.nextInt();
        }
        int v = scan.nextInt();

        int result = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] == v) result++;
        }

        System.out.println(result);
    }
}
