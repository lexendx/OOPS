import java.util.Scanner;

public class Fibbonacci{
    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Close the scanner as it's no longer needed
        scanner.close();

        // Variables to store the first two Fibonacci numbers
        int first = 0, second = 1;

       
        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 2; i < n; i++) {
            // Calculate the next number in the series
            int next = first + second;
            System.out.print(" " + next);

            // Update the first and second values for the next iteration
            first = second;
            second = next;
        }
    }
}
