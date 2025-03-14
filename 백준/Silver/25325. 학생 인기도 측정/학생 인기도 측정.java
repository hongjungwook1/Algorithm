import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(scan.nextLine());
        List<String> students = Arrays.asList(scan.nextLine().split(" "));
        Map<String, Integer> voteCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] votes = scan.nextLine().split(" ");
            for (String vote : votes) {
                voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
            }
        }

        students.sort((s1, s2) -> {
            int count1 = voteCount.getOrDefault(s1, 0);
            int count2 = voteCount.getOrDefault(s2, 0);
            return count2 == count1 ? s1.compareTo(s2) : count2 - count1;
        });


        for (String student : students) {
            sb.append(student).append(" ").append(voteCount.getOrDefault(student, 0)).append("\n");
        }
        System.out.print(sb);
    }
}
