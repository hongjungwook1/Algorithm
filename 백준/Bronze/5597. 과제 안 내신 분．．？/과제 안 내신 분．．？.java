import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] students = new int[30];

        for (int i = 0; i < 28; i++) {
            int num = scan.nextInt();
            students[num - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] == 0) System.out.println(i + 1);
        }
    }
}
