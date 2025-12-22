import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] nm = br.readLine().split(" ");

        Map<String, List<String>> girlGroupMap = new HashMap<>();
        Map<String, String> memberToGroupMap = new HashMap<>();

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for (int i = 0; i < n; i++) {
            String groupName = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());

            List<String> members = new ArrayList<>();
            for (int j = 0; j < memberCount; j++) {
                String memberName = br.readLine();
                members.add(memberName);
                Collections.sort((members));

                girlGroupMap.put(groupName, members);
                memberToGroupMap.put(memberName, groupName);
            }
        }

        for (int j = 0; j < m; j++) {
            String quiz = br.readLine();
            int quizType = Integer.parseInt(br.readLine());

            if (quizType == 0) {
                List<String> members = girlGroupMap.get(quiz);
                for (String member : members) {
                    sb.append(member).append("\n");
                }
            } else {
                sb.append(memberToGroupMap.get(quiz)).append("\n");
            }
        }
        System.out.println(sb);
    }
}