package homework;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
