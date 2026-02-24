public class Con1 {
    public static void main(String[] args) {

        student s1=new student();
        
    }


    
}
/*
Constructor is an special method wich is invoke automatically
at the time of object creation

1) constructor have same name as the class name
2) Constructor dont have a return type
3) cunstructor are only calls the once at the object creation
4) memory allowcation happens when cunstructor is created

*/

class student{
    String name;
    int marks;


    student(){
        System.out.println("constructor is called ");
    }
}