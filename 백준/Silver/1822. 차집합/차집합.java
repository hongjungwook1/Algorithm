import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < A; i++) {
            setA.add(scan.nextInt());
        }

        for (int i = 0; i < B; i++) {
            int number = scan.nextInt();
            setA.remove(number);
        }

        if (setA.isEmpty()) {
            System.out.println(0);
            return;
        }

        List<Integer> result = new ArrayList<>(setA);
        Collections.sort(result);

        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}