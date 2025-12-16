import java.util.*;
class Hash_01{
    // hashmap store a key value pair...

    public static void main(String[] args){

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"pruthvi");
        map.put(2,"sahil");
        map.put(3,"sumit");
        map.put(4,"soham");

        for(Map.Entry<Integer,String> entry :map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());


        }
    }
}