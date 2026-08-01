import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First number :");
        int a = sc.nextInt();
        System.out.println("Enter your Second number :");
        int b = sc.nextInt();
        System.out.println("Choose your Operation [+,-,*,/,%] : ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Addition:" + (a + b));
                break;
            case '-':
                System.out.println("Subtraction:" + (a - b));
                break;
            case '*':
                System.out.println("Multiplication :" + (a * b));
                break;
            case '/':
                System.out.println("Division : " + (a / b));
                break;
            case '%':
                System.out.println("Modulus : " + (a % b));
                break;
            default:
                System.out.println("INVALID OPERATION");


        }
    }
}
