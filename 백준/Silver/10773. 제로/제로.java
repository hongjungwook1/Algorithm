import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int num = scan.nextInt();

            if (num == 0) {
                int size = list.size();
                list.remove(size - 1);
            } else {
                list.add(num);
            }
        }

        int sum = list.stream()
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(sum);

    }
}