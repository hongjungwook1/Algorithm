import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        Set<String> users = new HashSet<>();

        for (int i = 0; i < T; i++) {
            String name = scan.next();
            String status = scan.next();

            if (status.equals("enter")) {
                users.add(name);
            } else if (status.equals("leave")) {
                users.remove(name);
            }
        }
        List<String> result = new ArrayList<>(users);
        result.sort(Collections.reverseOrder());
        result.forEach(System.out::println);
    }
}