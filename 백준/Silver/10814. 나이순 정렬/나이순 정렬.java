import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] member = br.readLine().split(" ");
            members.add(new Member(Integer.parseInt(member[0]), member[1], i));
        }
        members.sort(Comparator.comparingInt(m -> m.age));

        for (Member result : members) {
            sb.append(result.age).append(" ").append(result.name).append("\n");
        }
        System.out.println(sb);
    }

    static class Member {
        int age;
        String name;
        int order;

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
}
