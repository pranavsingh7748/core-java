package basics.conditional_statement;

public class EvenOdd {

    public static void main(String[] args) {
        int a=7;
        int result = 0;

         if(a%2==0){
             result = 10;
         }else {
             result = 20;
         }
        System.out.println(result);







         int x=4;
        int result1 = 0;

        result1 = x%2==0 ? 10 : 20; // this is the one line code with same output
        // 10 represents EVEN and 20 represent ODD
        System.out.println(result1);
    }

}
