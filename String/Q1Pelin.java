import java.util.Arrays;

public class Q1Pelin {
    public static void main(String[] args) {

       String s=new String();
       s="ababaa";

       char[] arr=s.toCharArray();

       System.out.println(Arrays.toString(arr));

       int i=0;
       int j=arr.length-1;
       boolean isPelin=true;
       while(i<j){
        if(arr[i]!=arr[j]){
            isPelin=false;
            break;
        }
        i++;
        j--;
       
        
       }
       if(isPelin){
        System.out.println("true");
       }else{
        System.out.println("false");
       }

        
    }
    
}
