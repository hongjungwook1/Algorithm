import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int L = scan.nextInt();

        List<Integer> fruits = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            fruits.add(scan.nextInt());
        }
        fruits.sort(Integer::compareTo);

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(L) || fruits.get(i) < L) {
                L++;
            }
        }
        System.out.println(L);
    }
}
