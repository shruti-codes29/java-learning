import java.util.Scanner;
public class Input {
        public static void main() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your name :");

                String name = sc.next();
                System.out.println("Hello," + name);

                System.out.println("Enter your number(Integer):");
                int a = sc.nextInt();

                System.out.println("Enter your number (byte):");
                byte b = sc.nextByte();

                System.out.println("Enter your number(short):");
                short s = sc.nextShort();

                System.out.println("Enter your number(long):");
                long l = sc.nextLong();

                System.out.println("Enter your number(Double):");
                double d = sc.nextDouble();

                System.out.println("Enter your number(float):");
                float f = sc.nextFloat();

                System.out.println("Enter your Character:");
                char ch = sc.next().charAt(0);

                System.out.println("Enter your boolean value :");
                boolean value = sc.hasNextBoolean();
        }
}
