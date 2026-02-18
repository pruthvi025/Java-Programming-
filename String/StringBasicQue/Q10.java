// Write a program that removes duplicate characters from a string while keeping 
// the first occurrence of each character.
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        String str="Pruthviraj Thorbole";

        HashSet<Character> set=new HashSet<>();
        StringBuilder result=new StringBuilder();


        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
            set.add(ch);
            result.append(ch);
            }
        }

        
        System.out.println(result);

    }
}
