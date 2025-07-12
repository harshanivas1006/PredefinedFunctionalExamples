package collectionExample;
import java.util.Scanner;

public class PushAllZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(a[i] == 0) {
                for(int j = i + 1; j < n; j++) {
                    if(a[j] != 0) {
                        // Swap a[i] and a[j]
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
//                        break;
                    }
                }
            }
        }

        // Print the result
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
