package Practice;
import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = getSum(n);
System.out.println("Sum is: "+sum);		
		
		sc.close();
	} public static int getSum(int n) {
		if(n>0) {
			
			return n%10+getSum(n/10);
			
		}else
		
		return 0;
		
		
		
		
	}

}
