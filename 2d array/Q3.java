/*Q3. Row-wise Sum
Calculate and print sum of each row separately.
Example:

text
Input: 
1 2 3
4 5 6

Output:
Row 0 sum: 6
Row 1 sum: 15 */

import java.util.*;
public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[2][3];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter a values for "+i+"th row is : ");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                int val=arr[i][j];
                 sum+=val;
            }
            System.out.println("the sum of "+i+"th row is : "+sum);
        }
        
    }
}
