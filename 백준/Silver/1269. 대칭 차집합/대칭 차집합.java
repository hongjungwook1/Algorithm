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

            if (!setA.contains(number)) {
                setA.add(number);
            } else {
                setA.remove(number);
            }
        }
        System.out.println(setA.size());
    }
}