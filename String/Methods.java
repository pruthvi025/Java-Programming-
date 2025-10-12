import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String name = "i am pruthvi";

        System.out.println(Arrays.toString(name.toCharArray()));
        // Arrays.toString method is static method that takes an array and returns a
        // human-readable string representation of that array.
        // toString() gives a text description of an object.
        // If you don’t override it, you get the object’s technical ID
        // (ClassName@hashcode).
        // If you do override it, you control how your object is displayed.

        System.out.println(name.toLowerCase());// print in lower cas same for upper case

        System.out.println(name.length());
        //Split and Strip
        System.out.println(name.strip());//remove white space from prefix and suffix
        System.out.println(Arrays.toString(name.split(" ")));//create a array and split it where the white spaces is there
    }

}
