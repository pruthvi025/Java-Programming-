/*Create a 2x3 2D array with values:

text
1 2 3
4 5 6
 */
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        int[][] arr=new int[2][3];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.println("enter values "+i+"th row");
            for(int j=0;j<arr[i].length;j++){
                
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("you entered array is : ");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        

        
    }
}
