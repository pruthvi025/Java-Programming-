public class SB {
    public static void main(String[] args) {
            // String builder make a only one object and  all changes are done only in that object 


            // String builder is and seprate datatype and seprate class

            StringBuilder builder=new StringBuilder(); // it is an immutable

            for( int i=0;i<26;i++){
                char ch=(char)('a'+i);
                builder.append(ch);//its not creating new object it made changes only in builder object 
            }
            System.out.println(builder);

            // there is an many method used in String builder like 
            // deleteCharat, reverse,append,indexof,insert,replace,lastindex and more.

            // to reverse 

            builder.reverse();
            System.out.println(builder);
    }
    
}
