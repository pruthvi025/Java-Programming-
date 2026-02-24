package Basic;
public class AccesModi {
    public static void main(String[] args) {
        
        bank b1 = new bank();
        b1.Username="pruthvi";
        // b1.password="nnnbnbn";  <-- give error because private key so we have created the method under class to acces it
        
        b1.setpassword("abcderf");

        System.out.println(b1.Username);

    }
}

class bank{
    public String Username;
    private String password;

    public void setpassword(String pwd){
        password=pwd;
        
    }
}
