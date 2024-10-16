import java.util.Scanner;

public class SwitchCase2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first Number");
	int a = sc.nextInt();
	System.out.println("Enter the Second Number");
	int b = sc.nextInt();
	System.out.println("Enter the Output(+,-,*,/)");
	
	char op = sc.next().charAt(0);
	switch(op)
	{case'+':
	System.out.println(a+" + "+b+" "+(a+b));
	break;
	
	case'-':
		System.out.println(a+" - "+b+" "+(a-b));
		break;
	case'*':
		System.out.println(a+" * "+b+" "+(a*b));
		break;
	case'/':
		System.out.println(a+" / "+b+" "+(a/b));
		break;
		
	default:
		System.out.println("Are Kehna kya Chahte ho");
	
	
	}
	
	sc.close();
	
}
}
