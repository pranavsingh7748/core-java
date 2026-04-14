package concept_2.string5;

public class string {
    public static void main(String[] args) {
        String name = new String("Pranav");
        String name1= "Singh"; // we don't need to new String();\]

        String s1 = new String("Suman");
        s1 = s1 + " Rathore"; // this mean add name

        System.out.println(name);
        System.out.println(s1);
        System.out.println(name1);
        System.out.println("Hello " + name);
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Rajput")); // this mean add name


    }
}
