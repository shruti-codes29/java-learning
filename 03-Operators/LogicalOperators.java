 //Admission Eligibilty 
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter your marks :");
        int marks = sc.nextInt();

        if (!(!(age >= 18) || !(marks >= 75))) {
            System.out.println("Eligible for Admission");
        } else {
            System.out.println("Not Eligible for Admission");
        }
    }
}

