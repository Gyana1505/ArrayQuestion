//Move all zeros to the end of array.

import java.util.Arrays;
import java.util.Scanner;

public class moveZero {
    static void moveZero(int arr[]){
        int start=0,end= arr.length-1;
        while (start<end){
            if ( arr[end]==0){
                end--;
            } else if (arr[start]!=0) {
                start++;
            }else {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of element");
        int x=sc.nextInt();
        int arr[]=new int[x];
        // it is code for enter element in array
        for (int i = 0; i < x; i++) {
            arr[i]= sc.nextInt();
        }
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
