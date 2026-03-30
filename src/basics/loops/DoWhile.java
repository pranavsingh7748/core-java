package basics.loops;

public class DoWhile {
    public static void main(String[] args) {
        //        int i =1;  // what have when I use i=5 in same conditions lets watch
        int i =5; // in this code compiler use loop then condition is i=5; and while say i<=4 so loop check the conditions then print only 5
        do {
            System.out.println(i+" Hii");
            i++;
        } while (i<=4);
    }
}

