package basics.conditional_statement3;

public class IfElse {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        if (a < b) {
            System.out.println("This is True");
        } else {
            System.out.println("This is False");
        }

        if (a > b && b <= a) {
            System.out.println("This is Right");
        } else {
            System.out.println("This is Wrong");
        }


    }
}