// Write a program that removes all spaces from a given string and prints the updated string.
public class Q6 {
    public static void main(String[] args) {

        // String str = " Hello here is Pruthvi   ";
        // String str1=str.replace(" ","");
        // System.out.println(str1);

        StringBuilder str = new StringBuilder("Hey this is pruthvi ");

        String result = "";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                result+=ch;
            }
        }

        System.out.println(result);


        
    }
}
