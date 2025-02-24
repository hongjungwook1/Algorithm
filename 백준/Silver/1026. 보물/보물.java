import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            listA.add(scan.nextInt());
        }
        for (int i = 0; i < N; i++) {
            listB.add(scan.nextInt());
        }

        listA.sort(Integer::compareTo);
        listB.sort(Collections.reverseOrder());

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += listA.get(i) * listB.get(i);
        }
        System.out.println(result);
    }
}