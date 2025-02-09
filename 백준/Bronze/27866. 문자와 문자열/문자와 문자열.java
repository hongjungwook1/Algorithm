import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String T = scan.next();
        int idx = scan.nextInt();
        
        System.out.println(T.charAt(idx - 1));
    }
}
