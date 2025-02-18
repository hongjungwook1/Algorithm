import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;

        while (true) {
            String[] word = scan.nextLine().split("");
            if (word[0].equals("0") && word.length == 1) {
                break;
            }
            for (int i = 0; i < word.length; i++) {
                if (word[i].equals("0")) {
                    result += 4;
                } else if (word[i].equals("1")) {
                    result += 2;
                } else {
                    result += 3;
                }
            }
            System.out.println(result + 2 + word.length - 1);
            result = 0;
        }
    }
}