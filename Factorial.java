import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        // Corrected the Scanner object spelling
        Scanner sc = new Scanner(System.in);

        // Prompt for input
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // Fixed the method call, should be getFact instead of getSum
        int sum = getFact(n);

        // Fixed the output message spacing
        System.out.println("Sum up to " + n + " is: " + sum);
    }

    // Fixed method name and logic - it's a factorial function now
    public static int getFact(int n) {
        // Recursive factorial logic
        if (n > 1) {
            return n * getFact(n - 1); // factorial is product, not sum
        } else {
            return 1; // base case for factorial, 0! and 1! are 1
        }
    }

}
