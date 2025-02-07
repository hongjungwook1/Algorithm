import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        String d = scan.next();

        Long ab = Long.parseLong(a + b);
        Long cd = Long.parseLong(c + d);

        Long result = ab + cd;
        System.out.println(result);
    }
}