
import java.util.*;
public class StringBasic {
    public static void main(String[] args) {
        String str="pruthvi";

        System.out.println(str);

        String str1=new String("my string ");//second way to create string in java
        System.out.println(str1);


        // Scanner sc=new Scanner(System.in);
        // String mystr=sc.nextLine();
        // System.out.println(mystr);

        StringTokenizer st=new StringTokenizer("hey what are you doing");
        System.out.println(st);

        String s= "Sachin";
       s= s.concat(" Tendulakar");
        System.out.println(s);


    }
    
}
