// Write a function that takes a string and returns its reverse without using built-in reverse methods

public class String_02 {
    public static void main(String[] args) {
        String s="pruthvi";
        System.out.println(Strrev(s));
    }

    public static String Strrev(String S){
     
        int j=S.length()-1;
        String ReveString="";
// here we are using loop for reverse the string two pointer approch
        while(0<=j){
            ReveString+=S.charAt(j);
            j--;


        }
        return ReveString;


    }
    
}
