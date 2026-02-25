public class Con1 {
    public static void main(String[] args) {

        student s1=new student();
        student s2=new student ("pruthvi");
        student s3 =new student(25);

        
    }
    
}
/*
Constructor is an special method wich is invoke automatically
at the time of object creation

1) constructor have same name as the class name
2) Constructor dont have a return type
3) cunstructor are only calls the once at the object creation
4) memory allowcation happens when cunstructor is created

Constructor is a special method used to initialize an object and ensure it is created in a valid and consistent state.
*/

class student{
    String name;
    int rollNo;


    student(){  //<-   non parameterize constructor
        System.out.println("constructor is called ");
    }

    student(String name){        
        this.name=name;
    }                                     // here we have maked Constructor overloading (multiple Constructor who have same name)

    public student( int rollNo) {
        this.rollNo = rollNo;
    }
    
}

/*


type of constructor ..there is three type of constructor

1) non-paramiterize 
2) parameterize
3) copy constructor

*/