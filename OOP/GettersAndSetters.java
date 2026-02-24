
import java.util.*;
public class GettersAndSetters {
    /*
     * getters and setters
     * 
     * get:-> to return the value
     * set :-> to set the values
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name of user :- ");
        String name=sc.nextLine();

        System.out.println("enter a age of ther user :- ");
        int age = sc.nextInt();

        System.out.println("enter a salary of the user :- ");
        float salary=sc.nextFloat();

        sc.nextLine(); 

      

        Bank user1=new Bank();
        user1.setBankDetails(name,age,salary,"username","pass");
        
        System.out.println("Name of bank account holder is :- "+user1.GetName());
        System.out.println("age of bank account holder is :- "+user1.getAge());
        System.out.println("salary of bank account holder is :- "+user1.getSalary());
        
        // Check credientials ;- 

          System.out.println("Enter a username of the User to verify :- ");
        String username=sc.nextLine();

        System.out.println("enter a password of the user to verify:- ");
        String pass=sc.nextLine();





        if(user1.checkUsername(username)){
            System.out.println("Username is Correct");
        }else{
            System.out.println("username is not correct");
        }

        if(user1.checkPass(pass)){
            System.out.println("password is correct ");
        }
        else{
            System.out.println("password is not correct");
        }

    


    }
}

class Bank {
    String Name;
    int age;
    protected float salary;

    private String Username;
    private String Password;

    // Setters->

    void setBankDetails(String nam, int ag, float salar, String usernam, String passwor) {
        this.Name=nam;
        this.age=ag;
        this.salary=salar;   // this keyword is used to refer the current object
        this.Username=usernam;
        this.Password=passwor;
    }

    // Getters ->

    String GetName(){
        return Name;

    }
    int getAge(){
        return age;
    }
    float getSalary(){
        return salary;
    }

    boolean checkPass(String inputpassword){
        return this.Password.equals(inputpassword);
    }
    boolean checkUsername(String inputUsername){
        return this.Username.equals(inputUsername);
    }

}
