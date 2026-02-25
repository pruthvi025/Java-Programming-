
public class hierachical {

// one baseclass and multiple derived class from that base class
public static void main(String[] args) {


    monkey m1=new monkey();
    m1.eat();
    // m1.swim(); <- give error 

    fish f1 = new fish();

    f1.swim();
}
    
}

class Animal{
    String color;

    void eat(){
        System.out.println("animal can eat ");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("fish can swim");
    }
}
class monkey extends Animal{
    void walk(){
        System.out.println("monkey can walk");
    }
}