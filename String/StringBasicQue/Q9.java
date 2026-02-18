// Write a program to check whether two strings are anagrams of each other.

// Two strings are anagrams if they contain the same characters with the same frequency, 
// but possibly in a different order
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        String str1=sc.nextLine();
        String str2=sc.nextLine();

        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character , Integer> map2= new HashMap<>();

        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(map1.containsKey(ch)){
                int freq=map1.get(ch);
                map1.put(ch,freq+1);


            }
            else{
                map1.put(ch,1);
            }
        }

        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);

            if(map2.containsKey(ch)){
                int freq=map2.get(ch);
                map2.put(ch,freq+1);
            }
            else{
                map2.put(ch,1);
            }
        }


        if(map1.equals(map2)){
            System.out.println("Both Strings Are Anagram ...");
        }else{
            System.out.println("both String Are not anagram");
        }
    }
}
