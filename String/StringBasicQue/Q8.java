
// Write a program that counts the number of words in a sentence.
public class Q8 {
    public static void main(String[] args) {

        String str= "hii this is pruthviraj thorbole";
int count=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch==' '){
                count++;

            }
        }
        System.out.println(count+1);
    }
}
