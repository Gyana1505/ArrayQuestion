import java.util.Arrays;
import java.util.Scanner;

public class leftRotate {
   // Rotate array by K positions (left).
    static void rotate(int arr[],int k){
        int n= arr.length;
        k=k%n;
        revers(arr,0,k-1);
        revers(arr,k,n-1);
        revers(arr,0,n-1);
    }
    static void revers(int arr[],int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
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
       System.out.println("enter position");
       int k= sc.nextInt();
       rotate(arr,k);
       System.out.println(Arrays.toString(arr));
   }
}
