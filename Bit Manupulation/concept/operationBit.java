
public class operationBit {
    

    public static int getIthbit(int n , int i){
        int bitmask=1<<i;

        if((n&bitmask)==0){
            System.out.println("0");
            return 0;
        }
        else{
        System.out.println("1");

            return 1;
        }
        
    }
    
    public static void main(String[] args) {
        
        /*
        get ith bit-> getting the ith index bit
        */
       getIthbit(15, 5);
    }
    
}
