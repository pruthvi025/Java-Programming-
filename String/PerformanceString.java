public class PerformanceString {
    public static void main(String[] args) {
        String series=" ";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i); // print all the latter from a to z by doing typecasting
           series+=ch;// it is make copy and then add its not optimum so we can use string builder
        }
        System.out.print(series);


        // above programm is require more space because at each iteration it will make copy of each object 
        //and then added to the next character without storing in any reference veriable so there is a wastage of storage

        // for overcome that problem we are using the String Builder concept

        // String builder make a only one object and  all changes are done only in that object 

        // we are seeing that concept in String builder program named as SB

    }
    
}
