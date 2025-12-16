import java.util.*;
public class Hash_02 {
    //Changing Elements in HashMap in Java
    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"john");
        map1.put(2,"jane");
        map1.put(3,"sam");
        map1.put(4,"julli");
        map1.put(2,"lukas");

        System.out.println(map1);
        for(Map.Entry<Integer,String> entry:map1.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());

        }
        

    }
    
}
