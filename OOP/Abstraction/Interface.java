public class Interface{
    /*
    Interface is an blueprint of class

    java does not support multiple inheritance so we are using Interface to implement the multiple inheritance

    interfaces used in two ways:-
    1) to achive an multiple inheritance
    2) to achive total abstraction (100%)we are using Interface

    properties :-

    1) All methods in interface are public,abstract  and without implementation
    2) used to achive total abstraction 
    3) veriable in Interface are final,public and static

    to use Interfaces we are using the Interface key and to inherit with class we have Implement key


    
    */


    public static void main(String[] args) {
        queen q1=new queen();
        q1.moves();
        
    }


}

interface chessBoard{
    void moves();   // here abstraction is happen
}

class queen implements chessBoard{

    public void moves(){    // access specifier is must public
        System.out.println("up,down ,left,right,all digonals");
    }

}

class pown implements chessBoard{
    public void moves(){
        System.out.println("up,down,if opposit any then by one digonal");
    }
}