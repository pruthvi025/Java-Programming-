import java.util.*;
// 8️⃣ Boundary Elements

// Question:
// Print only the boundary elements of the matrix.
public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            System.out.println("enter the values in " + i + "th row :- ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        int[][] ans = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 || i == arr.length - 1) {
                    ans[i][j] = arr[i][j];

                }
                if (j == 0 || j == arr.length - 1) {
                    ans[i][j] = arr[i][j];

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
