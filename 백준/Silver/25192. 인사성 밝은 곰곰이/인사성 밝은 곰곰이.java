import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Set<String> members = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String member = scan.next();
            if (member.equals("ENTER")) {
                count += members.size();
                members.clear();
            } else {
                members.add(member);
            }
        }
        System.out.println(count + members.size());
    }
}