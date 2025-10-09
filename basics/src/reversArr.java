import java.util.Arrays;
import java.util.Scanner;


public class reversArr {
    static int[] reverse(int arr[]){
        int n=arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            n--;
        }
        return arr;
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
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
