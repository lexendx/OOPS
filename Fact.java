import java.util.Scanner;

public class Fact {

    public static void main(String[] args) {

        int n, fact = 1;
        System.out.println("Enter any Number");
        
        // Create a Scanner object
        Scanner r = new Scanner(System.in);
        
        // Read an integer input
        n = r.nextInt();

        // Close the scanner to avoid resource leaks
        r.close();

        // Calculate factorial
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        // Display the result
        System.out.println("Factorial: " + fact);
    }
}
