import java.sql.SQLOutput;
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

        //Increment and Decrement
        System.out.println("Enter a number for increment and decrement:");
        int x = sc.nextInt();
        System.out.println("x++ : "+(x++));
        System.out.println("++x : "+(++x));
        System.out.println("x-- : "+(x--));
        System.out.println("--x : "+(--x));

        
        //num1 is length and num2 is breadth of rectangle
        int area = num1*num2 ;
        int perimeter = 2*(num1+num2);
        System.out.println(area  );
        System.out.println(perimeter);
        System.out.println("Enter the radius of circle:");
        double rad = sc.nextDouble();
        double  pie = 3.14 ;
         double  circle = rad * rad * pie;
        System.out.println(circle);
        
        //Swapping
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("BEFORE SWAPPING");
        System.out.println("a="+a);
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("b="+b);
        a = a+b;
        b=a-b;
        a=a-b;

        System.out.println("AFTER SWAPPING");
        System.out.println("a="+a);
        System.out.println("b="+b);

        sc.close();






    }
    }
