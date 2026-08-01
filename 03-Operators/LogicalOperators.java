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




//LOGIN System
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "Shruti";
        String correctPassword = "Java123";

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}



