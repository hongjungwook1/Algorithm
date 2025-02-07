import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        
        String str = scan.nextLine().trim();
        String[] result = str.split(" ");

        if (result[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(result.length);    
        }
        

    }
}