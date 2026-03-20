package BASIC;


//public class if_else {
//    public static void main(String[] args) {
//        int a=6;
//        int b=3;
//
//        if(a<b){
//            System.out.println("This is True");
//        }else {
//            System.out.println("This is False");
//       }
//
//        if(a>b && b<=a){
//            System.out.println("This is Right");
//        }else{
//            System.out.println("This is Wrong");
//        }
//    }
//}



//
// //                                                        if else if
//
//
//public class if_else {
//    public static void main(String[] args) {
//        int a=5;
//        int b=7;
//        int c=9;
//
//        if(a>b){
//            System.out.println(a);
//        }else if(b>c){
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }
//    }
//}




//
//
// //                                                            check even or odd
//
//public class if_else {
//    public static void main(String[] args) {
//        int a=7;
//        int result = 0;
// //
// //        if(a%2==0){
// //            result = 10;
// //        }else {
// //            result = 20;
// //        }
//        // lets 2nd way to solve in one line
//
//        result = a%2==0 ? 10 : 20; // this is the one line code with same output
//        // 10 represents EVEN and 20 represent ODD
//        System.out.println(result);
//    }
//}








//                                                                                                SWITCH and BREAK
//
//public class if_else {
//    public static void main(String[] args) {
//        int n=3;
//
//        if(n==1){
//            System.out.println("Modnay");
//        }else if(n==2){
//            System.out.println("Tuesday");
//        }else if(n==3){
//            System.out.println("Wednesday");
//        }else if(n==4){
//            System.out.println("Thrusday");
//        }else if(n==5){
//            System.out.println("Friday");
//        }else if(n==6){
//            System.out.println("Saturday");
//        }else {
//            System.out.println("Sunday");
//        }
//    }
//}


//  in this code we use multiple if and else if so we can use SWITCH and BREAK

public class if_else {
    public static void main(String[] args) {
        int n = 13;

        switch (n) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please Enter Valid Value");

        }
    }

}