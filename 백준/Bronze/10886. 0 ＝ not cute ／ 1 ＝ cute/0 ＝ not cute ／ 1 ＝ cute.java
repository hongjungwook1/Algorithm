import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        int cute = 0;
        int noCute = 0;
        for (int i = 0; i < count; i++) {
            int num = scan.nextInt();
            if (num == 0) {
                noCute++;
            } else {
                cute++;
            }
        }

        if (cute > noCute) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}