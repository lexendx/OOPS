import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        char ch = sc.nextLine().charAt(0);
        
        switch (ch) {   
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println(ch + " is a vowel character");
                break;
                
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println(ch + " is a numeric character");
                break;
                
            default:
                System.out.println(ch + " is another character");
        }
        
        sc.close();
    }
}
