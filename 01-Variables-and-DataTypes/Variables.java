public class Variable {
    public static void main() {

        long value1 = 123456789;
        int value2 = (int)value1;
        System.out.println(value2);


        byte num1 = 100;
        long newNum = num1;
        System.out.println(newNum);
        System.out.println(num1);
        short num2 = 500;
        System.out.println(num2);
        int num3 = 4000000;
        long num4 = 327985798;
        System.out.println(num3);
        System.out.println(num4);
        float num5 = 3.1464535f;
        System.out.println(num5);
        double num6 = 3.1427676564668;
        System.out.println(num6);
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);
        char firstCharacter = 'a';
        System.out.println("My First Character is :" + (char)(firstCharacter+2));

    }
}
