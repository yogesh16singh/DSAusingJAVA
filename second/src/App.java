import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // find square root
        int i;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 1; i * i <= n; i++) {

        }
        System.out.print("Square root of " + n + " is:");
        System.out.print(i - 1);

    }
}
