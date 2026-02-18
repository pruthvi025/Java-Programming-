

import java.util.*;
public class Q4 {
    //Write a program that counts how many times each character appears in a string.
    public static void main(String[] args) {
        String str="aabbcdbabababa";
        
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(map.containsKey(ch)){
                int old_freq=map.get(ch);
                map.put(ch,old_freq+1);

            }
            else{
                map.put(ch,1);
            }

        }
        System.out.println(map);



    }
}
