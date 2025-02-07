import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int num = scan.nextInt();
            list.add(num);
        }

        Collections.sort(list);

        list.forEach(System.out::println);

    }
}