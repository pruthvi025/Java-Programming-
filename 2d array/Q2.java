import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        //Take rows and columns from user, then take all elements as input, and print the matrix.

        System.out.println("enter a the rows you want : ");
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();

        int[][] arr=new int[row][];

        for(int i=0;i<row;i++){
            System.out.println("enter a number of column you want in "+i+"th row : ");
            int col=sc.nextInt();
            arr[i]=new int[col];
            
            System.out.println("enter a values for "+i+"th row : ");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
            
        }

        System.out.println("your final array is :- ");
        System.out.println(Arrays.deepToString(arr));







    }
}
