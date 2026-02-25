public class interface1 {
    public static void main(String[] args) {

        pitbul p1=new pitbul();

        p1.eat();
        p1.swim();
        
    }
    
}
interface Animal{
    void eat();
    
}
interface Dog{
    
    void swim();
}

class pitbul implements Animal,Dog{

    @Override
    public void eat(){
        System.out.println(" dog is eating some food ....");
    }
    @Override
    public void swim(){
        System.out.println("dog can able to swim");
    }
}
