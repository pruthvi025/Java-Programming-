public class ShallowCopy {

    // shallow copy is achived using the clone method wich belongs from java.lang.object package

    // deep copy means if we have two object and even if we maked the changes in one object then it will not reflect in another object it is called as object copy
   // there is two methods of object copy one is shallow copy and another is deepcopy

   // Shallow copy means if make changes in any object then it will make changes aother object also of copy constructor
    public static void main(String[] args) {
        student s1 =new student();


        
    }
    
}

class student{
    int rollNo;
}

/*
Shallow Copy:
New object created, but internal referenced objects are shared.

Deep Copy:
New object created, and internal referenced objects are also duplicated.

*/