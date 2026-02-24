package Basic;

public class classObject {

    // in java object are stored in heap memor
    
    public static void main(String[] args) {

        student s1= new student();
        s1.name="pruthvi";
        s1.age=20;
        s1.percentage(70,75,36);

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);
        
        
    }
    
}
  class student{
        String name;
        int age;
        int percentage;

        int percentage(int phy, int chem,int math){

           return  percentage=(phy+chem+math)/3;   

        }

    }

