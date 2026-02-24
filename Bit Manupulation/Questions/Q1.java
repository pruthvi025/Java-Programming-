
public class Q1 {

    public static  void evenOdd(int n){

        int bitmask=1;

        if((n & bitmask)==1){
            System.out.println("number is odd");
        }
        else{
            System.out.println("number is even");
        }



    }

    public static void main(String[] args) {
        // check number is odd or even 

        evenOdd(30);


        
        
    }
    
}
