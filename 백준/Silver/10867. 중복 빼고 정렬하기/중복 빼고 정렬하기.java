import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        List<Integer> listNum = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            listNum.add(scan.nextInt());
        }

        listNum.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);

    }
}