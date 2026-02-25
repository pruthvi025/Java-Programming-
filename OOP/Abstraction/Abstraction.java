
public class Abstraction {
    /*
    There is an slightly difference between Abstraction and Encapsulation
    
    Encapsulation is used to wrapping up the data and releted functions   into single unit by using the access specifires and help to implement the data hiding .


    Abstraction :- it is used to hiding the unnecessary details and only showing the only important parts to the user

Abstraction is implemented using two ways:- 
    1) Abstract Classes
    2) Interfaces


    ** if create a class with the abstract key word then:- 
    1) we cannot able to create an instance of class(cannot able to create object)
    2) can have abstract and non-abstract methods
    3) can have constructor


    also we can able to create function or method  as abstract

    abstract method is such kind of methods in wich we are not able to make a implementation in same class




    */



    public static void main(String[] args) {

        dog d1 = new dog();

        d1.eat();
        d1.legs();

        chicken c1=new chicken();
        c1.eat();
        c1.legs();

       System.out.println(d1.color); // called the firstly base class constructor

       d1.changecolor();
       System.out.println("dog color :-"+d1.color);

       pitbull p1=new pitbull();

       // Animal-> dog-> pitbul constructore called from the base class


        
    }
    
}

abstract class Animal{
    String color;

    Animal(){
       System.out.println("Animal Constructore Called");
    }

   abstract void legs();   // also we can able to create function or method  as abstract but we cannon able to implement it in same class


   void eat(){
    System.out.println("eating the food ");
   }
}

class dog extends Animal{  // we have extend from the animals so its mandadtory to implement the abstract method ow it will throw the error

     dog(){
        System.out.println("horse Constructor called");
     }


    void legs(){
        System.out.println("dog have 4 legs");
    }

    void changecolor(){
        color="white";
    }
}

class pitbull extends dog{

    public pitbull() {
        System.out.println("pitbull constructor called");
    }
    
}



class chicken extends Animal{
    void legs(){
        System.out.println("chiken has an 2 legs");
    }

    
    void changecolor(){
        color="black";
    }
}

// if we want to have a bydefault functionality is same for all derived classes then we use constructor
// constructore is used also as to initialize a default varible to child class  also