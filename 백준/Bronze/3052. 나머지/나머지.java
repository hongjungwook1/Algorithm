import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
            int addNum = num % 42;
            result.add(addNum);
        }

        System.out.println(result.stream().distinct().count());
    }
}
