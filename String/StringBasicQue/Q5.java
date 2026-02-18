// Write a program to check whether a given string is a palindrome.
import java.util.*;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ch=sc.nextLine();
        StringBuilder str=new StringBuilder(ch);

        String rev =str.reverse().toString();
        if(rev.equals(ch)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        
    }
    
}
