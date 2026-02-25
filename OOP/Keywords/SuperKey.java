

public class SuperKey{

    // this keyword is used to refer the current object

    // super keyword is used when we want to refer Immidiate parent class objects
    /*
    primary used- :
    1) to acces the parent proporties 
    2) to acces the parent functions
    3) to access parent constructor also


    
    
    */
    public static void main(String[] args) {

        horse h=new horse(); 

        System.out.println(h.color);
        


        
    }
}

class Animal{

    String color;
    Animal(){

        System.out.println("Animal Constructor is called");

    }
}

class horse extends Animal{
   
    horse(){
         super.color="brown";
        System.out.println("horse Constructor is called ");
    }
}