import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of rows you want : ");
        int row=sc.nextInt();

        int[][] jagged=new int[row][];

        for(int i=0;i<row;i++){
            System.out.println("enter a number of columns you want in "+i+"th row");
            int col=sc.nextInt();
            jagged[i]= new int[col];
        
        System.out.println("Enter a values for "+i+"th rows  ");
        for(int j=0;j<col;j++){
            
            jagged[i][j]= sc.nextInt();
            
        }

        
    }
    System.out.println("Output of final array :- ");

    for(int i=0;i<jagged.length;i++){
        for(int j=0;j<jagged[i].length;j++){
            System.out.print(jagged[i][j]+" ");

        }
        System.out.println();
    }

    }
    
}
