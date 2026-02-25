public class StaticKey {

    // Static Keyword in java is used to share the same veriable or methods of a given class without 
//static member is shared by all objects of the class and can be accessed without creating an object.

/*

static is used with - methods,veriables,block of codes

static means onces initialize the values ..it will shared amongs objects

when we declare as final keyword then once initilize value cannot be changed

*/



    public static void main(String[] args) {

        student s1 = new student();
        s1.collegeName="ADCET";

        System.out.println("S1 :- " +s1.collegeName);

        student s2= new student();

        System.out.println("s2 :- "+s2.collegeName);  // without initializing college name to this object it will automatically shared because declare veriable as a static veriable
         
        student s3 = new student();
        int percentage=student.convertPercent(25, 52, 56);  // here we are calling static method with the help of class name because it is belong from the class not from any object 
       // we can also call it using the object of the class like s1 or s2
        System.out.println(percentage);
        
    }
    
}

class student{

    static int convertPercent(int maths,int phy,int chem){
          
        return (maths+phy+chem)/3;
    }

    static String collegeName;

    String name;

    void setName(String Name){
        this.name=Name;
    }

    String getname(){
        return this.name;
}

}