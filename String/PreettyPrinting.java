public class PreettyPrinting {
    public static void main(String[] args) {
        // suppose there is an float value with n number of values after decimal and we want only two values after decimal
        // then we perform operation like follows:

        float a=8.12556856645f;
        System.out.printf("the value is : %.2f",a);// it will print 8.13 because at also  do roundof
        // % it is an place holder 
        // .2f because it will specify how many number take after deciaml and f is for float
        System.out.println();

        System.out.printf("hello guys my name is %s and i am a %s person","pruthvi","cool");

        // here %s is for placeholder with String data type 
        // we using F insteade of using ln beacause F for formatting....

        // there are many placeholder in java 
    }
    
}
