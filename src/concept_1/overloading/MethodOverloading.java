package concept_1.overloading;

class Calculater{
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;

    } public int add(int n1, int n2){
        return n1+n2;

    } public Double add(double n1, double n2, double n3){
        return n1+n2+n3;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculater obj=new Calculater();
        int x = obj.add(3,8,9);
        int y = obj.add(3,8);
        Double z =obj.add(2.7,4.6,8.9);
        System.out.println("x= " + x + ", y=" + y + ", z = " + z);

    }
}
