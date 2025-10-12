public class string02 {
    public static void main(String[] args) {
        String a=new String("pruthvi");
        String b= new String("pruthvi");

        // here we created two object with diff values but
        // when it comes to the store it will store in heap memory rather than storing in pool memory
        // because we created a two object and stored value in heap in two diff location

        System.out.println(a==b);//it will print false

        // when u only need to check value then use dot equals method-(.equal()) it used for checking value is same or not
        // previously we are checking where is it storing same memory pool or not

        System.out.println(a.equals(b));// print true because values is same but stored in diff mem loc
        
    
    }
    
}
