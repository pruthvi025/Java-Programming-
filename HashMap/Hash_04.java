public class Hash_04 {
public static void main(String[] args){
    String P="pruthvi";
    int code=P.hashCode();//convert the String into Int type ..
    //hashcode of any Integer or Number it itself same..
    System.out.println(code);

// what is Hashing.....

  /*
hashing means trying to reduce hashcode in specified format like in size 10 or 12 or 15 as required..
 because adding elemnt in such a big hashcode index is not possible so we use the hashing

so we do that?????

we take a remeinder of the hashcode..

one possibity is there called as collision
 collision happens when we take a hasing of any two element and that are on same index (means after doing modulo)

Two ways to resolve collision 1-chaining 2-open Addressing 

Hashfunctions-
1)-Division Method :- h(k)=k%m, m may be anything ...like it can be size of array
2)-Multiplicative method :- h(k)=[(a.k%2^m)]>>(w-r)....a=random number,w=number of bit k,m= 2^r.....used to calculate the hash valuss






 */

}    
}
