package concept_2.string5;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pranav");
        sb.append(" Singh");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb.capacity());
        System.out.println(sb.length()); // length and capacity are the two different things
        System.out.println(sb);

    }
}
