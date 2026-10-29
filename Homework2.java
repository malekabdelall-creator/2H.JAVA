package homework;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }
}
