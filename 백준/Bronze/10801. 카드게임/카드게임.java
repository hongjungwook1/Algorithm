import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrA = new int[10];
        for (int i = 0; i < 10; i++) {
            arrA[i] = scan.nextInt();
        }

        int[] arrB = new int[10];
        for (int i = 0; i < 10; i++) {
            arrB[i] = scan.nextInt();
        }

        int a = 0, b = 0, d = 0;

        for (int i = 0; i < 10; i++) {
            if (arrA[i] == arrB[i]) {
                d++;
            } else if (arrA[i] > arrB[i]) {
                a++;
            } else {
                b++;
            }
        }

        if (a == b) {
            System.out.println("D");
        } else if (a > b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}