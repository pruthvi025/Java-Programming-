
public class string01 {
    public static void main(String[] args) {
        String a = "pruthvi";
        String b = "pruthvi";

        // we know that it will store in heap pool memeory because both reference
        // veriable have same value

        // but the question is how we can check is it really store in same pool or not
        // basically pool means it is an seprate memory structure inside the heap memory

        // for cheking we are using "== operator"

        System.out.println(a == b);
        // both veriable are referecing to the same object in same pool memory


        // now the question is how to create different object of same values e will see in next programm




    }

}