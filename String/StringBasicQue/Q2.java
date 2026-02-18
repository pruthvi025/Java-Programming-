public class Q2 {
    //Write a program that counts the total number of vowels in a given string.
    // Vowels include: a, e, i, o, u (both uppercase and lowercase).
    public static void main(String[] args) {
        
        String str="My college";

       str= str.toUpperCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char let=str.charAt(i);
            if(let=='A' || let=='E' || let=='I' || let=='O' ||let=='U'){
                count++;

            }
        }

        System.out.println(count);
        
    }
}
