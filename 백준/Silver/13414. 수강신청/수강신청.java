import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cutLine = scan.nextInt();
        int students = scan.nextInt();
        int count = 0;
        LinkedHashMap<String, Integer> studentsList = new LinkedHashMap<>();

        for (int i = 0; i < students; i++) {
            String studentId = scan.next();
            studentsList.remove(studentId);
            studentsList.put(studentId, i);
        }

        for (String s : studentsList.keySet()) {
            if (count == cutLine) break;
            System.out.println(s);
            count++;
        }
    }
}