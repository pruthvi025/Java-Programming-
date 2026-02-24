public class bit_01 {
    public static void main(String[] args) {

        //  bitwise operator:- 
        /*
        Binary ANd &
        Binary or |
        Binary XOR ^
        Binary onces complement ~
        binary left shit <<
        binary rightshift >>
        
        */

        //  Rules
        /*

        1) Binary AND &

        0 & 0 -> 0
        0 & 1 -> 0
        1 & 0 -> 0
        1 & 1 -> 1
        */

        System.out.println("Binary AND of 5 & 6-> "+(5 & 6)); // output is ->  4

        /*  Binary or |

        0 | 0 -> 0
        1 | 0 -> 1
        0 | 1 -> 1
        1 | 1 -> 1
        
        */

       System.out.println("Binary or of 5 & 6-> "+(5 | 6));

        /*  Binary Xor ^

        0 ^ 0 -> 0
        1 ^ 0 -> 1
        0 ^ 1 -> 1
        1 ^ 1 -> 0
        
        */

        System.out.println("Binary Xor of 5^ 6-> "+(5 ^ 6));

         /*  Binary once complement `

        0 ~  -> 1
        1 ~  -> 0
       
        if MSB (Most significant bit ) is 0 then number is positive if 1 then it will be negetive number
        MSB-  left most  side bit
        LSB (least significant bit) - right most side bit

        if we want to calculate actual value of negetive number then we will do 2s compliment 

        ~(0) = -1  because we are doing twos compliment complement

        explainantion

        ~0 - > 00000000 (after doing once comp it will become )->  11111111

        now if we want to calculate actual value of negetive number then we will do 2s compliment
        
        so->  1 1 1 1 1 1 1 1 1s comp is 
         
        0 0 0 0 0 0 0 0   and we add 1 for doing 2s comp
                      1
        _________________
        0 0 0 0 0 0 0 1   - > so value become 1 and ~0 have MSB is 1 so values is -1
                                                                                ______
        
        */
       System.out.println("bitwise once complement of 5 -> "+(~5));
       System.out.println("~0 ->  "+(~0));

       /*
         binary left shit <<

         a=5 - 000101100
         b=2

         000101100
         ||
    remove that two bits

         then it will eleminate first two bite (b=2) and fill the bits and  at last  add two zeros

         010110000
                 |
               added two bits

         a << b = we are doing left shift number by B places
         
         formula - >   a << b = a*2^b
       
       
       */
      int a=5;
      int b=2;

      System.out.println("left shift-> "+(a<<b));

      
       /*
         binary right shit >>

         a=5 - 000101100
         b=2

         000101100
                ||
    remove that two bits

         then it will eleminate last two bite (b=2) and fill the bits and  at first by adding two zeros

        00 0101100
         |
    added two bits

         a >> b = we are doing right shift number by B places
         
         formula - >   a >> b = a/2^b
       
       
       */
    //     int a=5;
    //   int b=2;

      System.out.println("right shift-> "+(a>>b));









        

        
    }

    
}
