
public class Singlelevel {

    // we can inherit the proporties and methods of parent class to child class
// in single level inheritance there is only one derived class from base class
    public static void main(String[] args) {

        fish Shark =new fish();
        Shark.eat();
        Shark.breaths();
        Shark.swim();
        
    }
    
}
class Animal{
    String color;

    void eat(){
        System.out.println("eating");
    }
    void breaths(){
        System.out.println("breaths");
    }
}

//derived class
class fish extends Animal{

    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}