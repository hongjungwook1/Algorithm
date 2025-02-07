import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int total = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int price = scan.nextInt();
            sum += price;
        }
        
        System.out.println(total - sum);
    }
    
}