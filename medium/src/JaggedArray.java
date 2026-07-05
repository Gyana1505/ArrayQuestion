//In Java, a Jagged array is a multidimensional array where each row can have a different number of columns.

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int row = sc.nextInt();
        int col[]=new int[row];
        int arr[][]=new int[row][];
        for (int i = 0; i < row; i++) {
            System.out.println("enter number of column");
            col[i]=sc.nextInt();
            arr[i]=new int[col[i]];
            for (int j = 0; j < col[i]; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col[i]; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
