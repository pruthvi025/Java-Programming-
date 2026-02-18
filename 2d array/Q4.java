/*Q4. Column-wise Sum
Calculate and print sum of each column.
Example:

text
Input:
1 2 3
4 5 6

Output:
Column 0 sum: 5
Column 1 sum: 7
Column 2 sum: 9 */

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr=new int[4][4];

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    // for(int i=0;i<3;i++){
    //     int sum=0;
    //     for(int j=0;j<2;j++){
    //         sum+=arr[j][i];
    //     }
    //     System.out.println("the sum of "+i+"th column is  : "+sum);
    // }
    int sum=0;

    for(int i=0;i<arr.length;i++){
        int j=i;
        
        sum+=arr[i][j];
    }
    int sum1=0;
    int size=arr[0].length-1;
    for(int i=0;i<arr.length;i++){
        int j=size;
        sum1+=arr[i][j];
        size=size-1;
    }

    System.out.println("sum of first digonal is :- "+sum);
        System.out.println("sum of second digonal is :- "+sum1);
        int totalsum=sum+sum1;
            System.out.println("sum of both digonal is :- "+totalsum);



    

     }

}
