import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();

        Map<String, Integer> members = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String getName = scan.nextLine().substring(0, 1);
            members.put(getName, members.getOrDefault(getName, 0) + 1);
        }

        TreeSet<String> result = new TreeSet<>();
        for (Map.Entry<String, Integer> entry : members.entrySet()) {
            if (entry.getValue() >= 5) {
                result.add(entry.getKey());
            }
        }

        if (result.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            for (String s : result) {
                System.out.print(s);
            }
        }
    }
}