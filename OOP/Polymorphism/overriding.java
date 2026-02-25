public class overriding {
    
    public static void main(String[] args) {

        deer d1=new deer();

        d1.eat();
       

        
    }
}

class Animal{
    void eat(){
        System.out.println("eat anything...");

    }
}
class deer extends Animal{
    @Override
    void eat(){
        System.out.println("eat grass");
    }
}