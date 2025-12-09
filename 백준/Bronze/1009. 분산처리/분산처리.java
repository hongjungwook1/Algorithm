import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int data = 1;
            for (int j = 0; j < B; j++) {
                data *= A;
                data %= 10;
            }
            if (data == 0)
                data = 10;
            list.add(data);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}