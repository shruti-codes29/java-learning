import java.util.Scanner;
public class Operators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();

        //Relational Operators
        System.out.println("a==b : "+ (a==b));
        System.out.println("a!=b : "+ (a!=b));
        System.out.println("a>b : "+(a>b));
        System.out.println("a<b : "+ (a<b));
        System.out.println("a>=b : "+(a>=b));
        System.out.println("a<=b : "+ (a<=b));

        //EQUALITY
        if (a==b) {
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }
        //LARGER NUMBER
        if (a>b) {
            System.out.println("Larger number :" +a);
        } else {
            System.out.println("Larger number :" +b);
        }
    }
}
