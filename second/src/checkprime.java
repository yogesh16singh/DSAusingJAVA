import java.util.Scanner;
import java.lang.Math;

public class checkprime {
    public static void main(String[] args) {
        boolean isprime = true;
        // Check Prime number
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double sr = Math.sqrt(n);
        System.out.println("square root of " + n + " is: " + sr);
        for (int i = 2; i < sr; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        if (isprime) {
            System.out.println(n + " is prime number");
        } else
            System.out.println(n + " is not prime number");
    }
}
