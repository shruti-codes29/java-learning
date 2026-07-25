import java.util.Scanner;
public class Basics {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Sum of num1 and num2:" + (num1 + num2));
        System.out.println("The product of num1 and num2 :" +(num1 * num2 ) );
        System.out.println(num1*num1);
        System.out.println("The subtraction of num1 and num2:" +(num1 - num2));
        System.out.println("The Division of num1 and num2:"+ (num1/num2));
        System.out.println("The modulus of num1 and num2:"+(num1 % num2));
    }
}
