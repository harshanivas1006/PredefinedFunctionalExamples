package collectionExample;
import java.util.Scanner;
public class Fact{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial=factorial* i;
        }
        System.out.println(factorial);
    }
}
