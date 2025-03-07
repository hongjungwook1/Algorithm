import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] NMK = br.readLine().split(" ");
        int N = Integer.parseInt(NMK[0]);
        int M = Integer.parseInt(NMK[1]);
        int K = Integer.parseInt(NMK[2]);
        Map<String, Integer> subjects = new HashMap<>();
        int middleScore = 0;

        for (int i = 0; i < N; i++) {
            String[] subject = br.readLine().split(" ");
            subjects.put(subject[0], Integer.parseInt(subject[1]));
        }

        for (int i = 0; i < K; i++) {
            String subject = br.readLine();
            middleScore += subjects.getOrDefault(subject, i);
            subjects.remove(subject);
        }

        List<String> sortSubjects = new ArrayList<>(subjects.keySet());
        sortSubjects.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return subjects.get(o2).compareTo(subjects.get(o1));
            }
        });

        int max = middleScore;
        int min = middleScore;
        for (int i = 1; i <= M - K; i++) {
            max += subjects.get(sortSubjects.get(i - 1));
            min += subjects.get(sortSubjects.get(sortSubjects.size() - i));
        }
        System.out.println(min + " " + max);
    }
}