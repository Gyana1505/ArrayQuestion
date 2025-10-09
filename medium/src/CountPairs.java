//Count pairs with a given sum.

import java.util.Scanner;
public class CountPairs {
    static int countPair(int arr[],int sum){

        int num=0;
        for (int i = 0; i < arr.length-1; i++) {
            int pair=sum-arr[i];

            for (int j = i+1; j < arr.length; j++) {
                if (pair == arr[j]) {
                    num++;
                }
            }
        }
        return num;
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
        System.out.println("Enter target sum");
        int n=sc.nextInt();

        System.out.println(countPair(arr,n));
    }
}
