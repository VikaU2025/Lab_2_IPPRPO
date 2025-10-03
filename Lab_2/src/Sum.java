import java.util.Scanner;

public class Sum {
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
