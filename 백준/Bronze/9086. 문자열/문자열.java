import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            String T = scan.next();
            System.out.println(T.charAt(0) + "" + T.charAt(T.length() - 1));
        }
    }
}
