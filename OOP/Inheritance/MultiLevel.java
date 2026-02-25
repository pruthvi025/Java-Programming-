
public class MultiLevel {
    // multiple inheritance means we derive child class from parent and parent class from the grandparent
    public static void main(String[] args) {

        monkey m1=new monkey();
        m1.eat();
        m1.legs=4;
        System.out.println(m1.legs);
        m1.color="brown";

        System.out.println(m1.color);
        
    }
    
}

class Animal{
    String color;

    void eat(){
        System.out.println("eating");
    }

    void breathe(){
        System.out.println("breathing");
    }
}

class Mammal extends Animal{
    int legs;
}

class monkey extends Mammal{
    String breed;
}
