import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            if (command[0].equals("add")) {
                numbers.add(Integer.parseInt(command[1]));
            } else if (command[0].equals("remove")) {
                numbers.remove(Integer.parseInt(command[1]));
            } else if (command[0].equals("check")) {
                if (numbers.contains(Integer.parseInt(command[1]))) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (command[0].equals("toggle")) {
                if (numbers.contains(Integer.parseInt(command[1]))) {
                    numbers.remove(Integer.parseInt(command[1]));
                } else {
                    numbers.add(Integer.parseInt(command[1]));
                }
            } else if (command[0].equals("all")) {
                for (int j = 0; j < 21; j++) {
                    numbers.add(j);
                }
            } else if (command[0].equals("empty")) {
                numbers.clear();
            }
        }
        System.out.println(sb);
    }
}