package basics.helloworld1;

public class literals3 {
    public static void main(String[] args) {
            int a=0b101;  // binary form
            int b=0100; // octal form
            int c=0x6E; // hexadecimal form

            float d=101.230f;
            float e=0123.222f; //It is a decimal literal despite the leading zero

            double f=56;
            double g=0x1.8p3; // 1.8 (hex) × 2^3 = 12.0
            double h=12e10; //  12 x 10^10 = 1.2E11 : 1.2 x 10^11 (120 billions)

            char i='a';
            i++;

            System.out.println(i);
    }
}

