import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print:");
        rows = sc.nextInt();
        
        // Loop to handle number of rows
        for (int i = 1; i <= rows; i++) {
            // Loop to print '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
