public class CopyConstr {
// copy constructor used to transfer the proporties of one object to another

    public static void main(String[] args) {
        

        student s1=new student("pruthvi", 25);
        s1.getdata();
         s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=90;

        student s2=new student(s1);
        s1.marks[1]=5;  // it is an change also in s2 even if after already copyng..because it copy the reference ..both object are pointing towords the same memory location
        // it is called as reference copy 

        System.out.println("object s2 is called");
        s2.getdata();

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

       

        
    }
    
}

class student{
    String Name;
    int rollNo;

    int[] marks;

    student(String name,int rollno){
        this.Name=name;
        this.rollNo=rollno;
        marks=new int[3];
    }

    void getdata(){
        System.out.println(Name);
        System.out.println(rollNo);
    }

    // copy constructor 
    student(student s1){
        marks=new int[3];

        this.Name=s1.Name;
        this.rollNo=s1.rollNo;
        this.marks=s1.marks;

    }
}
