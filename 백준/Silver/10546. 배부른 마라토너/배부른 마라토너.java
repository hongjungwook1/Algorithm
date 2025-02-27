import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int count = N * 2 - 1;
        Map<String, Integer> memberList = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String member = scan.next();
            memberList.put(member, memberList.getOrDefault(member, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : memberList.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}