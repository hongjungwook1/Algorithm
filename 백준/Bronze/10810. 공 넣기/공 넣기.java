import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int boxCount = scan.nextInt();
        int ballCount = scan.nextInt();

        int[] boxs = new int[boxCount];

        for (int i = 1; i <= ballCount; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            int ballNumber = scan.nextInt();

            for (int j = start - 1; j < end; j++) {
                boxs[j] = ballNumber;
            }
        }

        for (int i = 0; i < boxs.length; i++) {
            System.out.print(boxs[i] + " ");
        }
    }
}
