import java.util.ArrayList;

public class StringConcatinationOperation {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        // both a and b are character because when we write in '' single quoute 
        //then it will consider as a character so if we trying to concatinate it
        // then it  will return a sum of a and b with  aschii value  in integer format
        
        System.out.println("a"+"b"); // output id ab because it is an string

        System.out.println('a'+3);// print 100


        System.out.println((char)('a'+3));
        // print "d" because we are doing typecasting here int to char so it print after 3 latter of a 

         System.out.println("a"+3);// print a3
         // integer will be converted to Integer(class) that will call toString() means 3-> "3" String


         System.out.println("pruthvi"+new ArrayList<>());// print pruthvi[]
         // because println auto call the internal method toString so arraylist is  considered as object after conversion
         System.out.println("pruthvi"+new Integer(52));// print pruthvi52

         //System.out.println(new ArrayList<>()+new Integer(52));// give error because to concatinate any object we require at least one String type object it may be empty so.
        System.out.println(new ArrayList<>()+" "+new Integer(52));// it will not primitive




        // + operator in java we can only use with primitive and we can use with all complex as well 
        //but only one condition is at least on of these object is should be type String
    }


    
}
