
// Reverse a String
public class String_01 {
    public static void main(String[] args) {
        String S="pruthvi";
        System.out.println(Stringrev(S));
    
    }

    public static String Stringrev(String S){
        StringBuilder rev=new StringBuilder();

        rev.append(S);
        rev.reverse();

        return rev.toString();


    }
    
}
