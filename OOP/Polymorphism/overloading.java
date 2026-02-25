public class overloading{
    public static void main(String[] args) {

        calculator cal=new calculator();
        
        System.out.println(cal.sum(5,8));
        System.out.println(cal.sum(5,(float)3.6));
        System.out.println(cal.sum(5,9,6));

        
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(int a , float b){
        return a+b;
    }

    int sum(int a, int b , int c){
        return a+b+c;
    }

}