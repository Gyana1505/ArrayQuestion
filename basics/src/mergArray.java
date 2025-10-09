import java.util.Arrays;
import java.util.Scanner;

public class mergArray {
    static int[] merg(int arr1[],int arr2[]){
        int ln1=arr1.length-1;
        int ln2=arr2.length-1;
        int n=ln2;
        int len=arr1.length + arr2.length;
        int arr[]=new int[len];
        for (int i = 0; i<=ln1; i++) {
            arr[i]=arr1[i];
        }
        for (int i = len-1; i >=ln2 ; i--) {
            arr[i]=arr2[n];
            n--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of element");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ar[]=new int[x];
        int array[]=new int[y];
        // it is code for enter element in array
        for (int i = 0; i < x ; i++) {
            ar[i]= sc.nextInt();
        }
        for (int i = 0; i < y; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(merg(ar,array)));
    }
}
